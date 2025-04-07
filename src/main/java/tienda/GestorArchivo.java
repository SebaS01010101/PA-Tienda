package tienda;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GestorArchivo {

    public static final ObjectMapper objectMapper = new ObjectMapper();

    public static void guardarArchivoGenerico(String nombreArchivo, Object objeto) {
        try {
            objectMapper.writeValue(new File(nombreArchivo), objeto);
        } catch (IOException e) {
            System.err.println("Error al guardar el personaje en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    public static <T> T leerArchivoGenerico(String nombreArchivo, Class<T> claseTipo) {
        try {
            return objectMapper.readValue(new File(nombreArchivo), claseTipo);
        } catch (Exception e) {
            System.err.println("Error al leer el personaje desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }

}