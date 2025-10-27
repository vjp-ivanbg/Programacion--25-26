/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio2;

/**
 *
 * @author alumno
 */
import ejercicio2.suma; //importo la clase suma
import ejercicio2.multiplicacion; //importo la clase multiplicacion
import java.util.Scanner; //importo el scanner
public class Ejercicio2 {

    public static void main(String[] args) {
        /**
         * Creo los scaneres numerouno y dos
         */
        Scanner numero = new Scanner (System.in);
        int resultado; //creo variable resultado
      
        
        System.out.println("Porfavor introduzca un numero:");
            int num = numero.nextInt(); //imprime primer numero
        
        System.out.println("Ahora, introduzca un segundo numero:");
            int numdos = numero.nextInt(); //imprime segundo numero
            
        if (num > 10) {
            resultado = multiplicacion.multiplicacion(num, numdos);
            System.out.println("La operacion que se realizo es producto y el resultado es: " + resultado); 
            //imprime la multiplicacion si el primer numero es mayor a 10
        }else {
            resultado = suma.suma(num, numdos);
            System.out.println("La operacion que se realizo es suma y el resultado es: " + resultado); 
        }   //imprime la suma si el primer numero es menor que 10
    }
}
