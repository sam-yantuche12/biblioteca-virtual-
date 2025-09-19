package Modulo;

import java.time.LocalDateTime;

public class Favorito {
    private Usuario usuario;   // el dueño del favorito
    private Libro libro;       // el libro marcado como favorito
    private LocalDateTime fecha; // cuándo se marcó como favorito

    public Favorito(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fecha = LocalDateTime.now(); // registra la fecha automáticamente
    }

    // Getters
    public Usuario getUsuario() { return usuario; }
    public Libro getLibro() { return libro; }
    public LocalDateTime getFecha() { return fecha; }

    // Representación como String
    @Override
    public String toString() {
        return usuario.getNombre() + " - " + libro.getTitulo() + " (" + libro.getAutor() + ")";
    }
}
