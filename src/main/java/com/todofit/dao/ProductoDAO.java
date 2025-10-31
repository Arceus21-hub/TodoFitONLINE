
package com.todofit.dao;

import com.todofit.model.Producto;
import java.util.List;

public interface ProductoDAO {
    void agregar(Producto p);
    List<Producto> listar();
}
