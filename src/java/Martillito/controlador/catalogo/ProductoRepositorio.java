package Martillito.controlador.catalogo;

import Martillito.modelo.vo.Producto;
import java.util.List;

public interface ProductoRepositorio {
    List<Producto> getTodosProductos();

    public Producto getProductoPorCodigo(String codigo);
}
    