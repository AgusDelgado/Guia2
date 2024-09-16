package model;

public class Persona {

    private Integer dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona(Integer dni, String nombre, String apellido, String email, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }
    public Persona() {}

    public void mostrar (){
        System.out.println("DNI: " + this.dni + " Nombre: " + this.nombre + " Apellido " + this.apellido + " Email: " + this.email + " Direccion: " + this.direccion);
    }
}
