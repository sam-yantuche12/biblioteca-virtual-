package control;

import Persistencia.ArchivoFavoritos;
import Persistencia.ArchivoHistorial;
import vista.panelBiblioteca;

import javax.swing.*;
import java.util.List;

public class ControlBiblioteca {
    private panelBiblioteca panel;

    public ControlBiblioteca(panelBiblioteca panel) {
        this.panel = panel;
        inicializarEventos();
    }

    private void inicializarEventos() {
        panel.getBtnFavoritos().addActionListener(e -> {
            List<String> favs = ArchivoFavoritos.cargarFavoritos();
            JOptionPane.showMessageDialog(null,
                    favs.isEmpty() ? "No tienes favoritos." : String.join("\n", favs),
                    "Mis Favoritos", JOptionPane.INFORMATION_MESSAGE);
        });

        panel.getBtnHistorial().addActionListener(e -> {
            List<String> hist = ArchivoHistorial.cargarHistorial();
            JOptionPane.showMessageDialog(null,
                    hist.isEmpty() ? "No tienes historial." : String.join("\n", hist),
                    "Mi Historial", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
