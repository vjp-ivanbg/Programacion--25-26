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

    public static void suma(int num) {
         if(num > 0) {
            System.out.println("el numero introducido es positivo");
        }else {
            System.out.println("El numero introducido es negativo");
        }
        
        
    }
    public static void main(String[] args){
        
        
        System.out.println("porfavor introduce un numero: ");
        
        Scanner numero = new Scanner(System.in);
        
        int num = numero.nextInt();
        
        suma(num);
    }
}
