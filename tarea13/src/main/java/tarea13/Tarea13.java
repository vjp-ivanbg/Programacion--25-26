/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarea13;

/**
 *
 * @author alumno
 */
public class Tarea13 {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        System.out.println("La variable numero1 contiene el valor " + numero1 + " y la variable numero2 tiene " + numero2);
        
       int aux = 1;
       aux = numero1;
       numero1 = numero2;
       numero2 = aux;
       
       
       System.out.println("ahora la variable numero1 contiene el valor " + numero1 + " y la variable numero2 tiene " + numero2);
       
      
    }
}
