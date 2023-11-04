
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
        var resultado = (1 > 2) ? "verdaddero" : "Falso"; // prueba logica ? Si es verdadero : Si es falso
        System.out.println("resultado = " + resultado);

        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero Par" : "Numero impar";
        System.out.println("resultado = " + resultado);

    }
}
