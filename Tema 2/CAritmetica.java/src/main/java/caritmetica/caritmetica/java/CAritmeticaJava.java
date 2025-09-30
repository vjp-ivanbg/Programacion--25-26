/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package caritmetica.caritmetica.java;

/**
 *
 * @author alumno
 */
public class CAritmeticaJava {
    
    public static void main (String[] args)   {
        int dato1; //declaro variable entera dato1
        int dato2; //declaro variable entera dato2
        int dato3, resultado; //declaro a la vez, dos variables enteras: dato3 y resultado
        
        dato1 = 5;
        dato2 = 8;
        dato3= 6;
        
        
        //Suma
        resultado = dato1 + dato2 + dato3;
        System.out.println(dato1 + "+" + dato2 + "+" + dato3 + "=" + resultado);
        
        
        //resta
        resultado = dato1 - dato2 - dato3;
        System.out.println( dato1 + "-" + dato2 + "-" + dato3 + "=" + resultado);
        
        
        //multiplicacion
        resultado = dato1 * dato2 * dato3;
        System.out.println( dato1 + "*" + dato2 + "*" + dato3 + "=" + resultado);
        
        
   
        System.out.println("Bienvenido al mundo de Java.");
        System.out.println("el camino sera duro, pero valdra la pena.");
    }

    
}
