
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
            tipos primitivos entero: byte (8 bits), short (16 bits), int (32 bits), long (64 bits)
        */
       byte numeroByte = (byte)129;
        System.out.println("Valor byte: "+ numeroByte); 
        System.out.println("Valor minimo byte: "+Byte.MIN_VALUE); 
        System.out.println("Valor maximo byte: "+Byte.MAX_VALUE); 
        
        short numeroShort = (short)32768;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Valor minimo short: "+Short.MIN_VALUE); 
        System.out.println("Valor maximo short: "+Short.MAX_VALUE); 
        
        int numeroInt = (int)2147483648L;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Valor minimo int: "+Integer.MIN_VALUE); 
        System.out.println("Valor maximo int: "+Integer.MAX_VALUE); 
        
        long numeroLong = (long)9223372036854775808D;
        System.out.println("\numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: "+Long.MIN_VALUE); 
        System.out.println("Valor maximo long: "+Long.MAX_VALUE); 
        
        
    }
}
