/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio24;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        System.out.println("Por favor, introduzca el primer numero: ");
        
        int num1 = num.nextInt();
        
        System.out.println("Por favor, introduzca el segundo numero: ");
        
        int num2 = num.nextInt();
        
        System.out.println("Por favor, introduzca el tercer numero: ");
        
        int num3 = num.nextInt();
        
        int suma = num1 + num2 + num3;
        int producto = num1 * num2 * num3;
        
        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("El producto de los numeros introducidos es: " + producto);
    }
}
