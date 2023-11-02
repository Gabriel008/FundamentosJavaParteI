
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
        /*
            tipos primitivos de tipo flotante: float (32 bits) y double (64 bits)
        */
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor minimo float = " + Float.MIN_VALUE);
        System.out.println("valor maximo float = " + Float.MAX_VALUE);
     
        double  numeroDouble = 1.7976931348623158E308D;
        System.out.println("\nnumeroDouble = " + numeroDouble);
        System.out.println("valor minimo double = " + Double.MIN_VALUE);
        System.out.println("valor maximo double = " + Double.MAX_VALUE);
        
    }
}
