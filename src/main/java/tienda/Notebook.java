package tienda;

public class Notebook extends Dispositivo{
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook() {
    }

    public Notebook(String marca, String modelo, int ram, int almacenamiento, String procesador, String annoFabricacion, String precio,
                    String resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, modelo, ram, almacenamiento, procesador, annoFabricacion, precio);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    public String getResolucionPantalla() {
        return resolucionPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public int getBateria() {
        return bateria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "resolucionPantalla='" + resolucionPantalla + '\'' +
                ", tipoTeclado='" + tipoTeclado + '\'' +
                ", bateria=" + bateria +
                '}';
    }
}
