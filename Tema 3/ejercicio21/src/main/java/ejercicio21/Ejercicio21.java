/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio21;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        
        try {
        System.out.println("introduce el dividendo: ");
        int dividendo = numero.nextInt();
        
        System.out.println("introduce el divisor: ");
        int divisor = numero.nextInt();
        
        int resultado = dividendo / divisor;
        System.out.println(dividendo + "/" + divisor + "= " + resultado);
        
        }catch (ArithmeticException e) {
            System.out.println("No puedes dividir entre 0");
            System.out.println(e);
        }
    }
}
