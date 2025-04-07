package tienda;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo") // Campo que define el tipo
@JsonSubTypes({
        @JsonSubTypes.Type(value = Computador.class, name = "computador"),
        @JsonSubTypes.Type(value = Notebook.class, name = "notebook"),
        @JsonSubTypes.Type(value = Tablet.class, name = "tablet")
})

public class Dispositivo {

    private String marca;
    private String modelo;
    private int ram;
    private int almacenamiento;
    private String procesador;
    private String annoFabricacion;
    private String precio;

    public Dispositivo() {
    }

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
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", almacenamiento=" + almacenamiento +
                ", procesador='" + procesador + '\'' +
                ", annoFabricacion='" + annoFabricacion + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
