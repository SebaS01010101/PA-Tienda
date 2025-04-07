package tienda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> accesorios = new ArrayList<>();
        accesorios.add("Apple Pencil");
        accesorios.add("Funda");
        accesorios.add("Cargador");
        Tienda tienda = new Tienda("Calle Falsa 123");
        Computador compu1 = new Computador("Compu1", "No tiene", 16, 512, "Intel i7", "01/01/2023", "1000","RTX 3080","Asus 1000w","Asus","Asus TUF VG27AQ");
        Tablet tablet1 = new Tablet("Tablet1", "No tiene", 8, 128, "Apple A14", "01/01/2023", "500","Apple",accesorios);
        Notebook notebook1 = new Notebook("Notebook1", "No tiene", 16, 512, "Intel i7", "01/01/2023", "800","1920x1080","QWERTY ES",5000);

        tienda.addDispositivo(compu1);
        tienda.addDispositivo(tablet1);
        tienda.addDispositivo(notebook1);

        Cliente cliente1 = new Cliente("Juan", "Perez", "j.perez@gmail.com", "9 12345678",true, "Temuco");
        Cliente cliente2 = new Cliente("Juana" , "Perez", "juana.p@gmail.com", "9 87654321",false, "Temuco");

        tienda.addCliente(cliente1);
        tienda.addCliente(cliente2);
        System.out.println("Dispositivos en la tienda:");
        for (Dispositivo dispositivo : tienda.getDispositivos()) {
            System.out.println(dispositivo);
        }
        System.out.println("Clientes en la tienda:");
        for (Cliente cliente : tienda.getClientes()) {
            System.out.println(cliente);
        }


        String nombreArchivo = "tienda.json";
        GestorArchivo.guardarArchivoGenerico(nombreArchivo, tienda);
        System.out.println("Tienda guardada en el archivo " + nombreArchivo);


        Tienda tiendaCargada = GestorArchivo.leerArchivoGenerico(nombreArchivo, Tienda.class);
        if (tiendaCargada != null) {
            System.out.println("Tienda cargada desde el archivo " + nombreArchivo);
            System.out.println("Dispositivos en la tienda cargada:");
            for (Dispositivo dispositivo : tiendaCargada.getDispositivos()) {
                System.out.println(dispositivo);
            }
            System.out.println("Clientes en la tienda cargada:");
            for (Cliente cliente : tiendaCargada.getClientes()) {
                System.out.println(cliente);
            }
        } else {
            System.out.println("No se pudo cargar la tienda desde el archivo " + nombreArchivo);
        }


        Boleta boleta = new Boleta(new Date(),tienda, cliente1);
        boleta.agregarDispositivo(compu1);
        boleta.agregarDispositivo(tablet1);
        boleta.agregarDispositivo(notebook1);
        System.out.println("Boleta creada:");
        System.out.println(boleta);

        String nombreArchivoBoleta = "boleta.json";
        GestorArchivo.guardarArchivoGenerico(nombreArchivoBoleta, boleta);
        System.out.println("Boleta guardada en el archivo " + nombreArchivoBoleta);

        Boleta boletaCargada = GestorArchivo.leerArchivoGenerico(nombreArchivoBoleta, Boleta.class);
        if (boletaCargada != null) {
            System.out.println("Boleta cargada desde el archivo " + nombreArchivoBoleta);
            System.out.println(boletaCargada);
        } else {
            System.out.println("No se pudo cargar la boleta desde el archivo " + nombreArchivoBoleta);
        }

        System.out.println("Dispositivos en la boleta:");
        for (Dispositivo dispositivo : boletaCargada.getDispositivos()) {
            System.out.println(dispositivo);
        }

        System.out.println("Cliente de la boleta:");
        System.out.println(boletaCargada.getCliente());

        System.out.println("Fecha de la boleta:");
        System.out.println(boletaCargada.getFecha());

        System.out.println("Tienda de la boleta:");
        System.out.println(boletaCargada.getTienda());


    }
}