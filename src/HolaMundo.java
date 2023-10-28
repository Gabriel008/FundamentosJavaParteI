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
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
            
        var i=3.5;
        var j=4;
        
        System.out.println(i+j); //Se raliza la suma de numeros
        System.out.println(i+j+usuario);//Evaliacion de izquierda a derecha
        System.out.println(usuario+i+j);//Contecto cadena, todo es una cadena
        System.out.println(usuario+(i+j));//uso de parentesis modifican la prioridad en la evaluacion
    }
}
