package model;

public class EmployeeByHour extends Employee{

    private Integer hours;

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Override
    public Double calcularPago() {
        return (getSalary() * this.hours);
    }
}
