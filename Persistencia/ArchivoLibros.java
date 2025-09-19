
<<<<<<< HEAD
=======
import Modulo.Libro; // ✅ Importa la clase correctamente
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoLibros {
    private static final String RUTA = "data/libros.txt";

    // Guardar un libro
    public static void guardarLibro(Libro libro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
            bw.write(libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getGenero());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer todos los libros
    public static List<Libro> cargarLibros() {
        List<Libro> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    lista.add(new Libro(datos[0], datos[1], datos[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
>>>>>>> rama-yane
