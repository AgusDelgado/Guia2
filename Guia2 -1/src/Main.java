import model.Employee;
import model.EmployeeByHour;
import model.EmployeeFullTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee empleado = null;

        boolean salir = false;


        while (!salir) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar Empleado Tiempo Completo");
            System.out.println("2. Agregar Empleado por Horas");
            System.out.println("3. Agregar Empleado Contratista");
            System.out.println("4. Mostrar pagos de empleados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    empleado = new EmployeeFullTime();

                    System.out.println("Ingrese el nombre del empleado");
                    empleado.setName(scanner.next());

                    System.out.println("Ingrese el salario mensual");
                    empleado.setSalary(scanner.nextDouble());

                    System.out.println("Empleado guardado ");

                    break;

                case 2:
                    empleado = new EmployeeByHour();

                    System.out.println("Ingrese el nombre del empleado");
                    empleado.setName(scanner.next());

                    System.out.println("Ingrese la cantidad de horas trabajadas");





            }

        }
    }
}



/*Modela un sistema que gestione empleados de una empresa. Cada
empleado tiene un nombre, un salario y un método calcularPago() que
debe ser implementado de manera específica para cada tipo de empleado:
a. Implementa las siguientes clases: Empleado (clase base abstracta),
EmpleadoTiempoCompleto y EmpleadoPorHoras. Para los empleados
a tiempo completo, el método calcularPago() debe retornar el salario
mensual, mientras que para los empleados por horas, debe retornar
el salario calculado según las horas trabajadas. Utiliza polimorfismo
para invocar el método calcularPago() adecuado para cada-
empleado.
b. Ahora, agrega la clase "EmpleadoContratista" que representa a
empleados contratados por proyectos específicos. Esta nueva clase
de empleado tiene un salario basado en el número de horas
trabajadas y una tarifa por proyecto.
c. Permite al usuario realizar las operaciones necesarias mediante un
menú.
*/

// nombre del empleado, setear salario y que tipo de empleado es
