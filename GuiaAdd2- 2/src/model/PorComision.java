package model;

public class PorComision extends Personal{
    private Double salarioMinimo;
    private Integer clientesCaptados;
    private Double montoPorCliente;

    public Double getSalarioMinimo() {
        return salarioMinimo;
    }

    public Integer getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(Integer clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    public Double getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(Double montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    public PorComision(String dni, String nombre, String apellido, Integer anioDeIngreso, Integer clientesCaptados, Double montoPorCliente) {
        super (dni,nombre,apellido,anioDeIngreso);
        this.salarioMinimo = 750.0;
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public PorComision() {}

    @Override
    public Double obtenerSalario(){

        Double salario = this.salarioMinimo * this.clientesCaptados * this.montoPorCliente;
        if(salario < this.getSalarioMinimo()){
            return this.getSalarioMinimo();
        }else {
            return salario;
        }
    }
    @Override
    public void imprimir() {
        System.out.println("Dni: " + super.getDni() + " Nombre del empleado: " + super.getNombre() + "  Apellido del empleado: " + super.getApellido() +
                "  Ingreso:" + super.getAnioDeIngreso() + " Salario Minimo: " + getSalarioMinimo() + "  Clientes Captados: " + getClientesCaptados() +
                "  Monto por Cliente: " + getMontoPorCliente() + " Salario Final: " + obtenerSalario());

    }

}
/*Los empleados a comisión tienen un salario mínimo que será constante para todos los
empleados de este tipo e igual a 750.00$, un número de clientes captados y un monto por
cada cliente captado
El salario se obtiene multiplicando los clientes captados por el monto por cliente, si el salario
por los clientes captados no llega al salario mínimo, cobrará esta cantidad..*/