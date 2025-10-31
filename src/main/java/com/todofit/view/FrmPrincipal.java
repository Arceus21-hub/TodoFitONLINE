
package com.todofit.view;

import javax.swing.*;
import java.awt.*;

public class FrmPrincipal extends JFrame {
    public FrmPrincipal() {
        setTitle("TODOFIT - Tienda Deportiva");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btnProductos = new JButton("Gestión de Productos");
        btnProductos.addActionListener(e -> new FrmProducto().setVisible(true));

        add(new JLabel("Bienvenido a TODOFIT", SwingConstants.CENTER), BorderLayout.CENTER);
        add(btnProductos, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrmPrincipal().setVisible(true));
    }
}
