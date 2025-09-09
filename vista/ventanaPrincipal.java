package vista;

import javax.swing.*;
import java.awt.*;

public class ventanaPrincipal extends JFrame {

    public ventanaPrincipal() {
        //titulo 
        setTitle("Biblioteca Virtual");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tamaño
        setSize(1000, 700);
        // centra ala pantalla
        setLocationRelativeTo(null); // centrar ventana
        setLayout(new BorderLayout());

        //  Menú 
        MenuSuperior menuSuperior = new MenuSuperior();
        add(menuSuperior, BorderLayout.NORTH);

        //  Panel central (sugerencias)
        seccionSugerencias sugerencias = new seccionSugerencias();
        add(sugerencias, BorderLayout.CENTER);

        //  Panel inferior (Mi Biblioteca)
        panelBiblioteca biblioteca = new panelBiblioteca();
        add(biblioteca, BorderLayout.SOUTH);
    }
    }
