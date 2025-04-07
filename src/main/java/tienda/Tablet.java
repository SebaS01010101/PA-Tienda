package tienda;

import java.util.ArrayList;
import java.util.List;

public class Tablet extends Dispositivo{
    private final String resolucionPantalla;
    private final List<String> accesorios;

    public Tablet(String marca, String modelo, int ram, int almacenamiento, String procesador, String annoFabricacion,
                  String precio, String resolucionPantalla, List<String> accesorios) {
        super(marca, modelo, ram, almacenamiento, procesador, annoFabricacion, precio);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = new ArrayList<>();
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public List<String> getAccesorios() {
        return accesorios;
    }
}
