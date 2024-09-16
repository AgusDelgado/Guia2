import model.Estudiantes;
import model.MiembrosDelStaff;
import model.Persona;

public class Main {
    public static void main(String[] args) {

        Estudiantes estudiante1 = new Estudiantes(11111111, "Juan", "Perez", "juanito@email.com", "san luis 2321", 2019, 200.0, "Programacion");
        Estudiantes estudiante2 = new Estudiantes(22222222, "Pedro", "Gomez ", "pedrin@email.com", "roca 2725", 2023, 100.0, "Programacion");
        Estudiantes estudiante3 = new Estudiantes(33333333, "Luis", "Lopez ", "lucho@email.com", "dorrego 1469", 2024, 300.0, "Programacion");
        Estudiantes estudiante4 = new Estudiantes(44444444, "Pablo", "rodriguez ", "pablito@email.com", "viamonte 55", 2023, 400.0, "Ingenieria");

        MiembrosDelStaff miembro1 = new MiembrosDelStaff(15452162, "Jorge", "Torres ", "george@email.com", "Indendencia 1122", 1000.0, "Tarde");
        MiembrosDelStaff miembro2 = new MiembrosDelStaff(26289415, "Leo", "Messi ", "messi@email.com", "asdi120", 1200.0, "noche");

        Persona arrayPersomas[] = {estudiante1,estudiante2,estudiante3, estudiante4, miembro1,miembro2};



        for (int i = 0; i < arrayPersomas.length; i++) {
            arrayPersomas[i].mostrar();
        }

        int cantidadDeEstudiantes =0;
        int cantidadDeMiembros = 0;
        for(Persona p1 : arrayPersomas){
            if(p1 instanceof Estudiantes){
                cantidadDeEstudiantes++;
            } else if(p1 instanceof MiembrosDelStaff){
                cantidadDeMiembros++;
            }
        }
        System.out.println("La catidad de estudiantes es: " + cantidadDeEstudiantes + " La cantifdad de miembros del staff es: " + cantidadDeMiembros);

        double gananciaAlumnos = 0;
        for (Persona p2 : arrayPersomas) {
            if (p2 instanceof Estudiantes) {
        gananciaAlumnos = gananciaAlumnos + ((Estudiantes) p2).getCuota();
            }
        }
        System.out.println("Ingresos persividos por la institucion por cuotas: " + gananciaAlumnos);


    }
}
/*
Vamos a diseñar un programa que nos permita gestionar el personal que
concurre a una universidad. Para no hacerlo muy extenso vamos a
limitarnos a estudiantes y miembros de staff que a diferencia de los
estudiantes, estos perciben una remuneración. Ambos tipos comparten la
característica de Persona que posee los atributos de dni, nombre, apellido,
email y dirección.
Por otro lado tenemos al Estudiante que posee las características de
Persona y las de un estudiante, que en este caso son, año de ingreso,
cuota mensual y carrera. Y finalmente tenemos al miembro de Staff que
también es una Persona pero con características propias de alguien que
trabaja para una institución, por ejemplo salario y turno, este puede ser
mañana o noche.
Diagramar el UML identificando superclase y subclases, crear los
constructores necesarios, los getters y setters, y los métodos de ayuda que
consideres necesarios. Luego, en el main:
● Inicializar 4 estudiantes diferentes.
● Inicializar 4 miembros de staff con características diferentes.
● Crear un array que permita almacenar juntos los tipos
anteriores y almacenar las 8 instancias creadas anteriormente.
● Investigar el uso de la palabra reservada instanceof.
● Recorrer el array y mostrar por pantalla la cantidad de
estudiantes y la cantidad de miembros de staff.
● Recorrer el array y sumar el total de ingresos que percibe la
institución por parte de la cuota de estudiantes.
 */