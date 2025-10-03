/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio26;

/**
 *
 * @author bueso
 */
import java.util.Scanner;

public class Ejercicio26 {
   
    public static void main(String[] args) {
        Scanner cifra1 = new Scanner (System.in);
        System.out.println("Porfavor, introduzca un numero de 4 cifras: ");
        
        int cifra = cifra1.nextInt();
        
        int primera = cifra / 1000;
        int segunda = (cifra / 100) % 10;
        int tercera = (cifra / 10) %10;
        int cuarta = cifra % 10;
        
        System.out.println("La primera cifra es : " + primera);
        System.out.println("La primera cifra es : " + segunda);
        System.out.println("La primera cifra es : " + tercera);
        System.out.println("La primera cifra es : " + cuarta);
        
    }
    
}
