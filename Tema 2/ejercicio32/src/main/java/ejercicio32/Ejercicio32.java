/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio32;

/**
 *
 * @author bueso
 */
import java.util.Scanner;


public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique una cantidad de dinero: ");
        int cantidad = sc.nextInt();
        
        int billetes50 = (cantidad / 50);
        cantidad = cantidad % 50;
        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;
        int billetes10 = cantidad / 10;
        cantidad = cantidad % 10;
        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;
        int monedas2 = cantidad / 2;
        cantidad = cantidad % 2;
        int monedas1 = cantidad; 

        System.out.println("La cantidad se descompone en:");
        System.out.println(billetes50 + " billetes de 50");
        System.out.println(billetes20 + " billetes de 20");
        System.out.println(billetes10 + " billetes de 10");
        System.out.println(billetes5 + " billetes de 5");
        System.out.println(monedas2 + " monedas de 2 euros");
        System.out.println(monedas1 + " monedas de 1 euro");
    }
}
