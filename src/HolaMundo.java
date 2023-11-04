


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
     int a = 3;
     var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("\nc = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1. preincremento (simbolo antes de la variable)
        var e =3;
        var f =++e;//primero se incrementa la variable y despues se usa su valor
        System.out.println("\ne = " + e);
        System.out.println("f = " + f);
        
           //2. postincremento (simbolo despues de la variable)
           var g= 5;
           var h = g++; //Primero se usa el valor y despues se incrementa
           System.out.println("\ng = " + g);//teniamos pendiente un incremento
           System.out.println("h = " + h);
           
        
           //decremento
           //1.predecremento
           var i= 2;
           var j = --i; //Primero se usa el valor y despues se incrementa
           System.out.println("\ni = " + i);//ya esta decrementada
           System.out.println("j = " + j);
       
           //1.prostdecremento
           var k= 4;
           var l= k--; //Primero se usa el valor y despues se incrementa
           System.out.println("\nk = " + k);//tenia pediente un decremento
           System.out.println("l = " + l);
           
           
           
    }
}
