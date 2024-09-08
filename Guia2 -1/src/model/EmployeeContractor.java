package model;

public class EmployeeContractor extends EmployeeByHour{

    private Integer proyectPee;

    public Integer getProyectPee() {
        return proyectPee;
    }

    public void setProyectPee(Integer proyectPee) {
        this.proyectPee = proyectPee;
    }

    @Override
    public Double calcularPago() {
        return ((getSalary()*this.getHours()) + this.proyectPee);
    }
}
