package Martillito.controlador;

import Martillito.controlador.catalogo.JDBCProductoRepositorio;
import Martillito.controlador.catalogo.ProductoRepositorio;
import Martillito.modelo.vo.Producto;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/HerramientaServlet")
public class HerramientaServlet extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String codigo = request.getParameter("cod_prod");
            ProductoRepositorio productoRepositorio = new JDBCProductoRepositorio();
            Producto producto = productoRepositorio.getProductoPorCodigo(codigo);
            request.setAttribute("producto",producto);
            RequestDispatcher dispatcher  = request.getRequestDispatcher("/JSP/Descripcion.jsp");
            dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
