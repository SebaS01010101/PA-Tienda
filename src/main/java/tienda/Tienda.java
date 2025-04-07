package tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private final String direccion;
    private List<Dispositivo> dispositivos;
    private List<Cliente> clientes;

    public Tienda(String direccion) {
        this.direccion = direccion;
        this.clientes = new ArrayList<Cliente>();
        this.dispositivos = new ArrayList<Dispositivo>();
    }

    public void addDispositivo(Dispositivo dispositivo) {
        this.dispositivos.add(dispositivo);
    }

    public void addComputador(Computador computador) {
        this.dispositivos.add(computador);
    }
    public void addNotebook(Notebook notebook) {
        this.dispositivos.add(notebook);
    }
    public void addTablet(Tablet tablet) {
        this.dispositivos.add(tablet);
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void deleteDispositivo(Dispositivo dispositivo) {
        this.dispositivos.remove(dispositivo);
    }

    public void  deleteComputador(Computador computador) {
        this.dispositivos.remove(computador);
    }
    public void deleteNotebook(Notebook notebook) {
        this.dispositivos.remove(notebook);
    }

    public void deleteTablet(Tablet tablet) {
        this.dispositivos.remove(tablet);
    }


    @Override
    public String toString() {
        return "Tienda{" +
                "direccion='" + direccion + '\'' +
                ", dispositivos=" + dispositivos +
                ", clientes=" + clientes +
                '}';
    }
}
