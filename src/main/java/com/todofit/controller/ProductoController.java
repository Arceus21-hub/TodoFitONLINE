
package com.todofit.controller;

import com.todofit.dao.ProductoDAO;
import com.todofit.dao.ProductoDAOImpl;
import com.todofit.model.Producto;
import java.util.List;

public class ProductoController {
    private final ProductoDAO dao;

    public ProductoController() {
        this.dao = new ProductoDAOImpl();
    }

    public void agregarProducto(Producto p) {
        dao.agregar(p);
    }

    public List<Producto> obtenerProductos() {
        return dao.listar();
    }
}
