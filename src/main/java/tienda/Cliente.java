package tienda;

public class Cliente {
    private final String nombre;
    private final String apellido;
    private final String correo;
    private final String telefono;
    private final Boolean estadoCivil;
    private final String ciudad;

    public Cliente(String nombre, String apellido, String correo,
                   String telefono, Boolean estadoCivil, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil ? "Casado" : "Soltero";
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
