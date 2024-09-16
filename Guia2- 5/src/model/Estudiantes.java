package model;

public class Estudiantes extends Persona {
    private Integer anioDeIngreso;
    private Double cuota;
    private String carrera;

    public Integer getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(Integer anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Estudiantes(Integer dni, String nombre, String apellido, String email,String direccion , Integer anioDeIngreso, Double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioDeIngreso = anioDeIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public void mostrar(){
        System.out.println("DNI " + super.getDni() + " Nombre" + super.getNombre() + " Apellido " + super.getApellido() +
                " Email " + super.getEmail() + " Direccion " + super.getDireccion() +
                " Ano de ingreso "+ this.getAnioDeIngreso() + " cuota " + this.cuota + " carrera " + this.carrera);
    }
}
