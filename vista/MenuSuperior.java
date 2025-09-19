package vista;

import javax.swing.*;
import java.awt.*;

// Clase que representa el menú superior de la interfaz
public class MenuSuperior extends JPanel {

    // Constructor de la clase
    public MenuSuperior() {
       
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        
        setBackground(new Color(20, 30, 50));

        
        String[] categorias = {
            "Autores", "Idiomas",  "generos",
            "Otros géneros" };

        for (String cat : categorias) {
            JButton boton = new JButton(cat);
            boton.setBackground(new Color(70, 100, 150));
            boton.setForeground(Color.WHITE);
            boton.setFocusPainted(false);
            add(boton);
        }

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(0, 150, 0)); // Verde, por ejemplo
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setFocusPainted(false);
        add(btnBuscar);
    }
}
