package Modulo;

import java.time.LocalDateTime;

public class Historial {
    private Usuario usuario;    // usuario que abrió el libro
    private Libro libro;        // libro consultado
    private LocalDateTime fecha; // fecha y hora de la consulta

    public Historial(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = LocalDateTime.now(); // registra la fecha automáticamente
    }

    // Getters
    public Usuario getUsuario() { return usuario; }
    public Libro getLibro() { return libro; }
    public LocalDateTime getFecha() { return fecha; }

    // Representación en String
    @Override
    public String toString() {
        return fecha + " - " + usuario.getNombre() + " leyó: " + libro.getTitulo();
    }
}
