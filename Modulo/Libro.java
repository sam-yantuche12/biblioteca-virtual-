package Modulo;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;

    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + categoria + ")";
    }
}
