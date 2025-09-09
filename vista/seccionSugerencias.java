package vista;

import javax.swing.*;
import java.awt.*;

public class seccionSugerencias extends JPanel {

    public seccionSugerencias() {
        setLayout(new GridLayout(1, 3, 15, 15)); // 3 sugerencias
        setBackground(new Color(10, 20, 40));

        // Portadas de ejemplo (puedes cambiar por imágenes reales)
        add(crearPortada("Colección Asesinatos"));
        add(crearPortada("Colección Infantil"));
        add(crearPortada("Colección Humor"));
    }

    private JPanel crearPortada(String titulo) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 300));
        panel.setBackground(new Color(80, 40, 40));
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel(titulo, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        panel.add(label, BorderLayout.CENTER);

        return panel;
    }
}
