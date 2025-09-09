package Persistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoHistorial {
    private static final String RUTA = "data/historial.txt";

    public static void guardarHistorial(String entrada) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
            bw.write(entrada);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> cargarHistorial() {
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
