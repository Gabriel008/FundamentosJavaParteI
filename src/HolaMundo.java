


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
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d= a!=b;
        
        System.out.println("d = " + d);
        
        var cadena="Hola";
        var cadena2="Hola";
        var e= cadena == cadena2;//compara referencias de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);//compara contenido de cadenas
        System.out.println("f = " + f);
        
    }
}
