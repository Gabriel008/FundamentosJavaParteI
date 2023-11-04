
import java.util.Scanner;

//Mi clase JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gabri
 */
public class HolaMundo {
    
    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona Nombre:  ");
        String  nombre = consola.nextLine();
        
        System.out.println("\nProporciona Id:  ");
        int id = Integer.parseInt(consola.nextLine());
        
        System.out.println("\nProporciona Precio:  ");
        double precio = Double.parseDouble(consola.nextLine()) ;
        
        System.out.println("\nEnvio Gratuito? (true/false)  ");
        boolean gratuito =Boolean.parseBoolean(consola.nextLine());
        
        System.out.println("\n\n|------------------------------------| ");
        System.out.println("\t"+nombre+" # "+id);
        System.out.println("\tPrecio: $"+precio);
        System.out.println("\tEnvio Gratuito: "+gratuito);
        System.out.println("|------------------------------------| ");
        
    }
}
