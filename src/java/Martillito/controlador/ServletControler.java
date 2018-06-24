/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martillito.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Martillito.modelo.Herramienta;
import Martillito.modelo.adm.JDBCUsuarioRepositorio;
import Martillito.modelo.adm.UsuarioRepositorio;
import Martillito.modelo.vo.Perfil;
import Martillito.modelo.vo.Usuario;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author LAB-USR-AQ265-A1005
 */
@WebServlet(value = "/ServletControler")
public class ServletControler extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("j_username");
        String userclave = request.getParameter("j_password");

        UsuarioRepositorio usuarioRepositorio = new JDBCUsuarioRepositorio();
        //usuarioRepositorio.login(username, userclave);
        Usuario usuario = usuarioRepositorio.login(username, userclave);
        if (usuario != null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            RequestDispatcher dispatcher = request.getRequestDispatcher(
                    usuario.getPerfil().getIdPerfil() == 1 ? "/JSP/PortalAdmin.jsp" : "/JSP/Inicio.jsp");
            dispatcher.forward(request, response);

        } else {
            //Enviamos el mensaje
            response.sendRedirect("JSP/mensaje.jsp?userName=" + username + "&mensaje=Clave Incorrecta");
        }

        String accion = request.getParameter("accion");
        if (accion == null) {
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);
            accion = "";
            usuario = (Usuario) session.getAttribute("usuario");

        }
        if (usuario.getPerfil().getIdPerfil() == 1 && accion.equalsIgnoreCase("goregistrar")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/RegistrarUsuario.jsp");
            dispatcher.forward(request, response);
        } else if (usuario.getPerfil().getIdPerfil() == 1 && accion.equalsIgnoreCase("registrar")) {
            Usuario nuevo = new Usuario();
            Perfil perfil = new Perfil();
            perfil.setIdPerfil(Integer.getInteger("idPerfil"));
            nuevo.setDni(request.getParameter("txt_dni"));
            nuevo.setPerfil(perfil);
            nuevo.setApePaterno(request.getParameter("txt_apepater"));
            nuevo.setApeMaterno(request.getParameter("txt_apemater"));
            nuevo.setNombres(request.getParameter("txt_nom"));
            nuevo.setClave(request.getParameter("txt_clave"));
        } else {
            processRequest(request, response);
        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
