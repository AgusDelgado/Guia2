import model.Circle;
import model.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder (5.8,"amarillo",8.1);
        cylinder.mostrar();



        }
    }

    /*Definir la clase Círculo, que posee como atributo un radio cuyo valor por
defecto al ser inicializado sin valores es 1.0. Además el tipo Círculo posee
un atributo color, por defecto rojo, un método para calcular el área y otro
para imprimir sus características.
Por otro lado tenemos un tipo Cilindro, que extiende a la clase Circulo, por
ende se convierte en subclase de Círculo. El Cilindro a diferencia del
Círculo posee un atributo altura, que también se inicializa en 1.0 cuando no
le pasamos un valor a su constructor. Y un método para calcular el
volumen. Codifique ambas clases y realice las siguientes pruebas:
● Inicializar un Cilindro y debuguear analizando los constructores a
los que va llamando para inicializar la cadena de herencia. Imprimir
por pantalla, el radio del cilindro, la altura, el área de la base y el
volumen.
● Inicializar un segundo CIlindro esta vez especificando la altura y
radio. Imprimir por pantalla el radio, la altura, el área de la base y el
volumen.
● Sobreescribir el método calcular area declarado en Círculo, para
que nos permita calcular el área del cilindro.
(2π×radius×height + 2×areaBase)
● Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar
que el cálculo del volumen difiere, esto es porque nosotros
sobreescribimos el método calcular área y ahora nos calcula el área
de un cilindro. Modificar el método calcular volumen en la clase
cilindro para que llame al método de la SUPER clase que calcula el
área.
    Modificar el método correspondiente de la clase cilindro para que
imprima por pantalla lo siguiente: Cilindro: subclase de + {método
que muestra info de Círculo} +altura= {alturaCilindro}; */

