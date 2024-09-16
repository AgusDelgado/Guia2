package model;

public abstract class Personal {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected Integer anioDeIngreso;

    public abstract void imprimir();
    public abstract Double obtenerSalario();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public Integer getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(Integer anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public Personal(String dni, String nombre, String apellido, Integer anioDeIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioDeIngreso = anioDeIngreso;
    }

    public Personal() {}

    }

