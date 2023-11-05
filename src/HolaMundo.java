
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        //  var numero = 3;
        System.out.println("Inserte un numero (1-4): ");
        var consola = new Scanner(System.in);
        int numero = Integer.parseInt(consola.nextLine());
        var numeroTexto = "Valor Desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
