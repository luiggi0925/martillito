package Martillito.controlador;

import Martillito.controlador.catalogo.JDBCProductoRepositorio;
import Martillito.controlador.catalogo.ProductoRepositorio;
import Martillito.modelo.vo.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renato
 */
@WebServlet(name = "ListaHerramientasServlet", urlPatterns = {"/ListaHerramientas"})
public class ListaHerramientasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductoRepositorio productoRepositorio = new JDBCProductoRepositorio();
         List<Producto> listaProducto = productoRepositorio.getTodosProductos();
         request.setAttribute("listaProducto", listaProducto);
         RequestDispatcher dispatcher = request.getRequestDispatcher(
         "/JSP/listaHerramientasNuevo.jsp");
         dispatcher.forward(request, response);
    }
}
