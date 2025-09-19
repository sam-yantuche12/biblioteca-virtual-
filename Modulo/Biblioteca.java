package Modulo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Libro> buscarPorCategoria(String categoria) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(l);
            }
        }
        return resultado;
    }
}
