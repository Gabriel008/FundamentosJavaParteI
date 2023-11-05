
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        inicio:
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 != 0) {
                continue inicio; // Ir  a la linea de codigo de le etiqueta inicio
            }
            System.out.println("contador = " + contador);
        }

//        for (var contador = 0; contador < 10; contador++) {
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }
//        var contador = 0;
//        while (contador < 3) {
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 0); //Primero imprime y luego sale
    }
}
