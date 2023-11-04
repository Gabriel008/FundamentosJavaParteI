
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        int numero1;
        int numero2;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2: ");
        numero2 = Integer.parseInt(consola.nextLine());
        
        var mayor= numero1>=numero2 ? numero1:numero2;

        System.out.println("\n1----------------------------------- 1");
        System.out.println("\tEl numero mayor es: " +mayor);
        System.out.println("1----------------------------------- 1");
    }
}
