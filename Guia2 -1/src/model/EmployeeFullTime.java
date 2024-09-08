package model;

public class EmployeeFullTime extends Employee {



    @Override
    public Double calcularPago() {
        return (getSalary()*200);
    }
}
