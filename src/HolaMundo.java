
import java.util.Scanner;

//Mi clase JAVA
/**
 *
 * @author gabri
 */
public class HolaMundo {

    public static void main(String args[]) {
        // var mes = 4;
        System.out.println("Ingrese numero de mes: ");
        var estacion = "Estacion Desconocida";
        var consola = new Scanner(System.in);
        int mes = Integer.parseInt(consola.nextLine());

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
                break;
        }
        System.out.println("Estacion = " + estacion);
    }
}
