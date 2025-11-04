/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio26;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio26 {
    /**
     * Método que pedirá un número
     */
    public static int esPrimo() {
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Porfavor, introduce un número: ");
        int numero = entrada.nextInt();
        return numero;
        }

    public static void main(String[] args) {
        
        int n = esPrimo();
        boolean enc = false;
        int i = 1;
        
        while (i < n && !enc);
        
        if (n % i == 0) {
            enc = true;
            System.out.println("el numero no es primo");
        }else{
            i++;
        
        }
    }
}
