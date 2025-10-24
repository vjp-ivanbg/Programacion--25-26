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
       
        System.out.println("porfavor introduce un numero: ");
        
    }
    
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        
        num = numero.nextInt();
        
        if(num > 0) {
            System.out.println("el numero introducido es positivo");
        }else {
            System.out.println("El numero introducido es negativo");
        }
    }
}
