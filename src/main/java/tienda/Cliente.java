package tienda;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Boolean estadoCivil;
    private String ciudad;

    public Cliente() {
    }

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

    public Boolean getEstadoCivil() {
        return estadoCivil;
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
