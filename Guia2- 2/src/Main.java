import model.Autor;
import model.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Autor autor = new Autor("Joshua", "Bloch","joshuabloch@email.com","M" );

    Libro librtio = new Libro();
    librtio.setAutor(new Autor());

    Libro libro = new Libro("Effetive Java",450.0, 150, autor);
    libro.mostrar();

    libro.getAutor().mostrar();
    }
}


/*Es necesario modelar el objeto de tipo Libro con las siguientes
caracteristicas: titulo, precio, stock y Autor, este último posee las
características de: nombre, apellido, email y genero ( ‘M’ o ‘F’ ). Para este
ejercicio vamos a asumir que un libro tiene un único autor.
Ejecute las siguientes instrucciones:
a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”,
“joshua@email.com”, ’M’.
b. Imprima por pantalla al autor previamente instanciado.
c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta
450 pesos con una cantidad de 150 copias.
d. Imprima por pantalla el libro instanciado.
e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
cantidad en 50 copias.
f. Imprima por pantalla los atributos del Autor Joshua, accediendo
desde el Libro “Effective Java”.
g. Agregue un método a la clase Libro que posibilite imprimir en
pantalla el siguiente mensaje: “El libro, {título} de {nombre del autor}.
Se vende a {precio} pesos.
*/
