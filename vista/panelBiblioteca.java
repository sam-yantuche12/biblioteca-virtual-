package vista;

import javax.swing.*;
import java.awt.*;

public class panelBiblioteca extends JPanel {

    public panelBiblioteca() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 15));
        setBackground(new Color(25, 25, 50));

        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnFavoritos = new JButton("Mis Favoritos");
        JButton btnHistorial = new JButton("Mi Historial");

        // estilo rápido
        JButton[] botones = {btnLogin, btnFavoritos, btnHistorial};
        for (JButton b : botones) {
            b.setBackground(new Color(120, 40, 120));
            b.setForeground(Color.WHITE);
            b.setFocusPainted(false);
            b.setPreferredSize(new Dimension(150, 40));
            add(b);
        }
    }
}
