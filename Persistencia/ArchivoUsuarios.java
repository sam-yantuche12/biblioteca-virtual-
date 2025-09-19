<<<<<<< HEAD

=======
package Persistencia;

import Modulo.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoUsuarios {
    private static final String RUTA = "data/usuarios.txt";

    public static void guardarUsuario(Usuario usuario) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
            bw.write(usuario.getNombre() + ";" + usuario.getCorreo());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> cargarUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 2) {
                    lista.add(new Usuario(datos[0], datos[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
>>>>>>> rama-yane
