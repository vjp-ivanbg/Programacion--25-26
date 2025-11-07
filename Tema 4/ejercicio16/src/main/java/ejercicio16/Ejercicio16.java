/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio16;

/**
 *
 * @author bueso
 */
public class Ejercicio16 {

  

    public static void main(String[] args) {
        System.out.println("Raíz cuadrada de 64: " + raizcuadrada(64));
        System.out.println("8 elevado al cubo: " + elevaralcubo(8));
        System.out.println("Exponencial de 2: " + exponencial(2));
        System.out.println("Logaritmo de 2.71828: " + logaritmo(2.71828));
        System.out.println("Menor valor entre 2 y 3: " + menorvalor(2, 3));
        System.out.println("Valor absoluto de -4.5: " + valorabs(-4.5));
        System.out.println("Redondeando -4.5 con ROUND: " + redondear(-4.5));
        System.out.println("Seno de 45 grados: " + seno(45));
    }

   
    public static double raizcuadrada(double num) {
        return Math.sqrt(num);
    }

  
    public static double elevaralcubo(double num) {
        return Math.pow(num, 3);
    }

  
    public static double exponencial(double num) {
        return Math.exp(num);
    }

  
    public static double logaritmo(double num) {
        return Math.log(num);
    }

  
    public static double menorvalor(double a, double b) {
        return Math.min(a, b);
    }

    
    public static double valorabs(double num) {
        return Math.abs(num);
    }

    
    public static long redondear(double num) {
        return Math.round(num);
    }

    
    public static double seno(double grados) {
        double radianes = Math.toRadians(grados);
        return Math.sin(radianes);
    }
  }

    

