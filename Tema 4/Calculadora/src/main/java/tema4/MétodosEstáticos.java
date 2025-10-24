/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;
import tema4.utilidades.Utilidades;
import tema4.Calculadora;
/**
 *
 * @author alumno
 */
public class MétodosEstáticos {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        double resultado;
        
        num1 = Utilidades.pedirnumero();
        num2 = Utilidades.pedirnumero();
        
        System.out.println(num1 + "-" + num2 );
    
    try {
        resultado = Calculadora.suma(num1, num2);
        System.out.println(num1 + "+" + num2);
    
        resultado = Calculadora.resta(num1, num2);
        System.out.println(num1 + "-" + num2);
        
        resultado = Calculadora.multiplicacion(num1, num2);
        System.out.println(num1 + "*" + num2);
        
        resultado = Calculadora.division(num1, num2);
        System.out.println(num1 + "/" + num2);
        
        resultado = Calculadora.raizcuadrada(num1);
        System.out.println("La raiz cuadrada de " + num1 + "es: " + resultado);
    } catch(ArithmeticException e){
        System.out.println("Ha sucedido una excepcion aritmetica");
    }
  }
}
