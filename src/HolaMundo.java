


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
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado Suma= " + resultado);

        resultado = a - b;
        System.out.println("resultado Resta= " + resultado);

        resultado = a * b;
        System.out.println("resultado Multiplicacion= " + resultado);

        resultado = a / b;
        System.out.println("resultado division= " + resultado);

        var resultado2 = 3F / b;
        System.out.println("resultado division= " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }


        
    }
}
