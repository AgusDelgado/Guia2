import model.Personal;
import model.PorComision;
import model.SalarioFijo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Gestora {
    public static void main(String[] args) {

        Personal personal;
        SalarioFijo salarioFijo = new SalarioFijo("569587A","Javier","Gomez", 2008,1225.0);
        PorComision porComision = new PorComision("69525B","Eva","Nieto",2010, 179,8.10);
        salarioFijo.imprimir();
        porComision.imprimir();
        SalarioFijo empleado1 = new SalarioFijo();
        PorComision porComision1 = new PorComision();
        empleado1.setDni("896325D");
        empleado1.setNombre("Maria");
        empleado1.setApellido("Nunez");
        empleado1.setAnioDeIngreso(2013);
        empleado1.setSueldoBasico(1155.00);
        empleado1.imprimir();
        porComision1.setDni("741258C");
        porComision1.setNombre("Jose");
        porComision1.setApellido("Ruiz");
        porComision1.setAnioDeIngreso(2012);
        porComision1.setClientesCaptados(81);
        porComision1.setMontoPorCliente(7.90);
        porComision1.imprimir();

        Personal mostrarTodo [] = {};
        Personal sueldoMayor [] = { salarioFijo, porComision1, empleado1,porComision1 };
        
        sueldoMayor = 0 ;
        if (sueldoMayor)

    //José Ruiz, DNI: 741258C, desde 2012, 81 clientes captados a 7.90$ cada uno.

    }
/*La empresa XYZ requiere una aplicación informática para administrar los datos de su
personal.
Del personal se conoce: número de DNI, nombre, apellidos y año de ingreso.
Existen dos categorías de personal: el personal con salario fijo y el personal a comisión. Los
empleados con salario fijo tienen un sueldo básico y un porcentaje adicional en función del
número de años que llevan: menos de dos años salario base, de 2 a 3 años: 5% más; de 4 a
7 años: 10% más; de 8 a 15 años: 15% más y más de 15 años: 20% más.
Los empleados a comisión tienen un salario mínimo que será constante para todos los
empleados de este tipo e igual a 750.00$, un número de clientes captados y un monto por
cada cliente captado.
El salario se obtiene multiplicando los clientes captados por el monto por cliente, si el salario
por los clientes captados no llega al salario mínimo, cobrará esta cantidad.
Se contará con una clase padre Empleado de la cual no se podrán crear objetos y de la que
heredan las clases EAsalariado y EComision. En todas las clases debe haber un constructor
con parámetros para todos los atributos y otro vacío. En todos deben crearse los getters and
setters correspondientes. Empleado contará con un método imprimir() y un método
obtenerSalario().
Se creará una clase gestora y en el método main se creará un arreglo con los siguientes
objetos:
■ Javier Gómez, DNI: 569587A, desde 2008, salario fijo base = 1225.00$.
■ Eva Nieto, DNI: 695235B, desde 2010, 179 clientes captados a 8.10$ cada uno.

■ José Ruiz, DNI: 741258C, desde 2012, 81 clientes captados a 7.90$ cada uno.
■ María Núñez, DNI: 896325D, desde 2013, salario fijo base = 1155.00$
Los dos primeros se crearán utilizando el constructor con todos los parámetros y los dos
últimos con el constructor vacío y utilizando los setters adecuados.
Desde el método main se llamará a estos otros dos métodos
sueldoMayor(): Dado un array de objetos Empleado muestra el nombre, apellido y
salario del que más cobra.
■ mostrarTodos(): Dado un array de objetos Empleado lo recorre imprimiendo los datos
de todos ellos
 */