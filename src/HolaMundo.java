
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        int alto;
        int ancho;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto en metros: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho en metros: ");
        ancho = Integer.parseInt(consola.nextLine());

        System.out.println("\n1----------------------------------- 1");
        System.out.println("\tArea: " + (alto * ancho)+"m\u00B2");
        System.out.println("\tPerimetro: " + ((alto + ancho) * 2)+"m\u00B2");
        System.out.println("1----------------------------------- 1");
    }
}
