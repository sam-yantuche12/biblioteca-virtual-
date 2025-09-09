package Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoFavoritos {
    private static final String RUTA = "data/favoritos.txt";

    public static void guardarFavorito(String favorito) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
            bw.write(favorito);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> cargarFavoritos() {
        List<String> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
