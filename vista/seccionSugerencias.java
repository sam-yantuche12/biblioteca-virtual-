package vista; 

import javax.swing.*; 
import java.awt.*;    

// Clase que representa una sección de sugerencias en la interfaz
public class seccionSugerencias extends JPanel {

    // Constructor de la clase
    public seccionSugerencias() {
        
        setLayout(new GridLayout(1, 3, 15, 15)); 
        
        setBackground(new Color(10, 20, 40));

        
        add(crearPortada("Colección Asesinatos"));
        add(crearPortada("Colección Infantil"));
        add(crearPortada("Colección Humor"));
    }

    // Método auxiliar para crear un panel que representa la portada de un libro o colección
    private JPanel crearPortada(String titulo) {
        JPanel panel = new JPanel(); 
        panel.setPreferredSize(new Dimension(200, 300)); 
        panel.setBackground(new Color(80, 40, 40)); 
        panel.setLayout(new BorderLayout()); 

        // Crea un JLabel centrado con el título de la colección
        JLabel label = new JLabel(titulo, SwingConstants.CENTER);
        label.setForeground(Color.WHITE); 
        panel.add(label, BorderLayout.CENTER); 

        return panel;
    }
}
