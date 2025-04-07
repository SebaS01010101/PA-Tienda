package tienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Boleta {

    private Date fecha;
    private Tienda tienda;
    private List<Dispositivo> dispositivos;
    private Cliente cliente;

    public Boleta() {
    }

    public Boleta(Date fecha, Tienda tienda, Cliente cliente) {
        this.fecha = fecha;
        this.tienda = tienda;
        this.cliente = cliente;
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
        tienda.deleteDispositivo(dispositivo);
    }

    public void agregarNotebook(Notebook notebook) {
        dispositivos.add(notebook);
        tienda.deleteNotebook(notebook);
    }

    public void agregarTablet(Tablet tablet) {
        dispositivos.add(tablet);
        tienda.deleteTablet(tablet);
    }

    public void agregarComputador(Computador computador) {
        dispositivos.add(computador);
        tienda.deleteComputador(computador);
    }


    public Date getFecha() {
        return fecha;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "fecha=" + fecha +
                ", dispositivos=" + dispositivos +
                ", cliente=" + cliente +
                '}';
    }
}
