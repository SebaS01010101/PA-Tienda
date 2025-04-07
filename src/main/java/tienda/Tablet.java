package tienda;

import java.util.ArrayList;
import java.util.List;

public class Tablet extends Dispositivo{
    private String resolucionPantalla;
    private List<String> accesorios;

    public Tablet() {
    }

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

    @Override
    public String toString() {
        return "Tablet{" +
                "resolucionPantalla='" + resolucionPantalla + '\'' +
                ", accesorios=" + accesorios +
                '}';
    }
}
