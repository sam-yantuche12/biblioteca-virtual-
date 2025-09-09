package vista;

import javax.swing.*;
import java.awt.*;

public class MenuSuperior extends JPanel {

    public MenuSuperior() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        setBackground(new Color(20, 30, 50));

        String[] categorias = {
            "Autores", "Idiomas", "Artículo", "Novela",
            "Cuento", "Biografía", "Documentos", "Leyendas", "Otros géneros"
        };

        for (String cat : categorias) {
            JButton boton = new JButton(cat);
            boton.setBackground(new Color(70, 100, 150));
            boton.setForeground(Color.WHITE);
            boton.setFocusPainted(false);
            add(boton);
        }
    }
}
