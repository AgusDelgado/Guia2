package model;

import java.time.Instant;
import java.util.Date;

public class SalarioFijo extends Personal {

    private Double sueldoBasico;
    private Double porcentajeAdicional;


    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(Double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public SalarioFijo (String dni, String nombre, String apellido, Integer anioDeIngreso,Double sueldoBasico) {
        super (dni, nombre, apellido, anioDeIngreso);
        this.sueldoBasico = sueldoBasico;

    }

    public SalarioFijo() {}
    @Override
    public Double obtenerSalario() {
        int aniosTrabajando = Date.from(Instant.now()).getYear() - super.getAnioDeIngreso(2013);
            if (super.getAnioDeIngreso(2013) <= 2) {
                return  sueldoBasico;

            } else if (aniosTrabajando >= 2 && aniosTrabajando <= 3) {
                return (sueldoBasico * 1.05);

            } else if (aniosTrabajando >= 4 && aniosTrabajando <= 7) {
                return (sueldoBasico * 1.10);

            } else if (aniosTrabajando >= 8 && aniosTrabajando <= 15) {
                return (sueldoBasico * 1.15);

            } else   {
               return (sueldoBasico * 1.20);
            }

        }

    @Override
    public void imprimir() {
        System.out.println("Dni: " + super.getDni() + " Nombre del empleado: " + super.getNombre() + "  Apellido del empleado: " + super.getApellido() +
                "  Ingreso:" + super.getAnioDeIngreso(2013) + " Salario Basico: " + getSueldoBasico() + "  Salario final: " + obtenerSalario() );

    }
}

/* Los
empleados con salario fijo tienen un sueldo básico y un porcentaje adicional en función del
número de años que llevan: menos de dos años salario base, de 2 a 3 años: 5% más; de 4 a
7 años: 10% más; de 8 a 15 años: 15% más y más de 15 años: 20% más.*/