
package com.todofit.dao;

import com.google.common.collect.Lists;
import com.todofit.model.Producto;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {
    private final List<Producto> productos = Lists.newArrayList();

    @Override
    public void agregar(Producto p) {
        productos.add(p);
    }

    @Override
    public List<Producto> listar() {
        return productos;
    }
}
