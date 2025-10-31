
package com.todofit.view;

import com.todofit.controller.ProductoController;
import com.todofit.model.Producto;
import javax.swing.*;
import java.awt.*;

public class FrmProducto extends JFrame {
    private final ProductoController controller;
    private final DefaultListModel<String> modeloLista;

    public FrmProducto() {
        controller = new ProductoController();
        modeloLista = new DefaultListModel<>();

        setTitle("Gestión de Productos TODOFIT");
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel pnlFormulario = new JPanel(new GridLayout(4, 2));
        JTextField txtNombre = new JTextField();
        JTextField txtCategoria = new JTextField();
        JTextField txtPrecio = new JTextField();

        pnlFormulario.add(new JLabel("Nombre:"));
        pnlFormulario.add(txtNombre);
        pnlFormulario.add(new JLabel("Categoría:"));
        pnlFormulario.add(txtCategoria);
        pnlFormulario.add(new JLabel("Precio:"));
        pnlFormulario.add(txtPrecio);

        JButton btnAgregar = new JButton("Agregar");
        pnlFormulario.add(btnAgregar);

        JList<String> lista = new JList<>(modeloLista);
        add(new JScrollPane(lista), BorderLayout.CENTER);
        add(pnlFormulario, BorderLayout.NORTH);

        btnAgregar.addActionListener(e -> {
            Producto p = new Producto(0, txtNombre.getText(), txtCategoria.getText(),
                    Double.parseDouble(txtPrecio.getText()));
            controller.agregarProducto(p);
            modeloLista.addElement(p.toString());
        });
    }
}
