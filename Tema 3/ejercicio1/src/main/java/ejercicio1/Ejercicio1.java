/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio1;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        
        boolean numeros = true;
        Scanner numero = new Scanner (System.in);
        
        System.out.println("introduzca un numero ");
        int cifra = numero.nextInt();
        if(numeros == true && cifra < 0) {
            System.out.println("tu numero es negativo");
        } else System.out.println("tu numero es positivo");
    }
}
