package tienda;

public class Dispositivo {

    private final String marca;
    private final String modelo;
    private final int ram;
    private final int almacenamiento;
    private final String procesador;
    private final String annoFabricacion;
    private final String precio;

    public Dispositivo(String marca, String modelo, int ram, int almacenamiento,
                       String procesador, String annoFabricacion, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.annoFabricacion = annoFabricacion;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getAnnoFabricacion() {
        return annoFabricacion;
    }

    public String getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
