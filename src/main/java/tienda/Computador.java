package tienda;

public class Computador extends Dispositivo {
    private final String tarjetaGrafica;
    private final String fuentePoder;
    private final String gabinete;
    private final String pantalla;

    public Computador(String marca, String modelo, int ram, int almacenamiento,
                      String procesador, String annoFabricacion, String precio, String tarjetaGrafica, String fuentePoder, String gabinete, String pantalla) {
        super(marca, modelo, ram, almacenamiento, procesador, annoFabricacion, precio);
        this.tarjetaGrafica = tarjetaGrafica;
        this.fuentePoder = fuentePoder;
        this.gabinete = gabinete;
        this.pantalla = pantalla;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public String getGabinete() {
        return gabinete;
    }

    public String getPantalla() {
        return pantalla;
    }
}
