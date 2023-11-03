
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
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
            System.out.println("\n|---------------------------------|");
            System.out.println("|Ingresa Edad:                    |");
            System.out.println("|---------------------------------|");
        Scanner consola = new Scanner(System.in);
        var edad = consola;
    
        //   var esAdulto = edad >= 18;
        //    if (esAdulto) {
            if (edad.nextInt() >= 18) {
                System.out.println("\nEs mayor de edad");
            } else {
                System.out.println("\nEs menor de edad");
            }


    }
}
