package model;

public class MiembrosDelStaff extends Persona {
    private Double salario;
    private String turno;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public MiembrosDelStaff(Integer dni, String nombre, String apellido, String email,String direccion, Double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public void mostrar() {
        System.out.println("DNI " + super.getDni() + " Nombre" + super.getNombre() + " Apellido " + super.getApellido() +
                " Email " + super.getEmail() + " Direccion " + super.getDireccion() +
                " Salario " + this.salario + " Turno " + this.turno);
    }
}
