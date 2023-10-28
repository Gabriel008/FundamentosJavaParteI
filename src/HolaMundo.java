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
    public static void main(String args[]){
        //Definimos la variable    
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - inferencia de tipos en JAVA
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena en variable var";
            System.out.println("miVariableCadena2: "+miVariableCadena2);
            System.out.println("soutv miVariableCadena2 = " +  miVariableCadena2);
    }
    
    
}
