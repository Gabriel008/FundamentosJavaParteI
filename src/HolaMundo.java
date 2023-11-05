
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        // var mes = 4;
        System.out.println("Proporciona un valor entre 0 y 10: ");
        var calificacion = "Valor desconocido";
        var consola = new Scanner(System.in);
        int valor = Integer.parseInt(consola.nextLine());

        if (valor >= 9 && valor <= 10) {
            calificacion = "A";
        } else if (valor >= 8 && valor < 9) {
            calificacion = "B";
        } else if (valor >= 7 && valor < 8) {
            calificacion = "C";
        } else if (valor >= 6 && valor < 7) {
            calificacion = "D";
        } else if (valor >= 0 && valor < 6) {
            calificacion = "F";
        }
        System.out.println("\n|--------------------------------------------| ");
        System.out.println("\tcalificacion = " + calificacion);
        System.out.println("|--------------------------------------------| ");
    }
}
