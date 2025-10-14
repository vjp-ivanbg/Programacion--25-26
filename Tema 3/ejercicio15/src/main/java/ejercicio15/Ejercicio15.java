/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio15;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner introduccion = new Scanner (System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar: ");
        
        int i;
        int tabla;
        int numero;
        numero = introduccion.nextInt();
        
        for (i=0;i <=10; i++){
           tabla = numero * i;
           System.out.println(numero+ "*" + i + ":" + tabla);
        }
    }
}
