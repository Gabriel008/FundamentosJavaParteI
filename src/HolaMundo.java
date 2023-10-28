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
            
            //Reglas para definir variables
            //Variable no iniciar ni con numeros, Mayusculas al inicio o caracteres especiales excepto _
            
            //Valores permitidos:
            var miVariable=1;
            var _miVariable=1;
            var $miVariable=1;
           // var áVariable=5; // no se recomienda usar tildes
           // var #Variable=5; // no se caracvteres caracteres especiales
    }
    
    
}
