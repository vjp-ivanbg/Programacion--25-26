/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio3;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
       
        System.out.println("Por favor, introduzca el primer numero: ");
        int num1 = numero.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero:");
        int num2 = numero.nextInt();
        
        System.out.println("Por último, introduzca el tercer numero: ");
        int num3 = numero.nextInt();
    }
}
