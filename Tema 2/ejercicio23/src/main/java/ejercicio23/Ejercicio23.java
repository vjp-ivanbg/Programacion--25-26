/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio23;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner bienvenida = new Scanner (System.in);
        
        System.out.println("Modelo 1-399.99");
        System.out.println("Modelo 1-510.99");
        System.out.println("Modelo 1-699.99");
        System.out.println("Porfavor, introduzca el precio del modelo que de ordenador que desea comprar: ");
        
        Float modelo = bienvenida.nextFloat();
        
        Scanner unidad = new Scanner (System.in);
        
        System.out.println("Cuantas unidades desea llevarse?: ");
       
        Float unidades = unidad.nextFloat();
        
        float resultado = modelo * unidades;
        
        System.out.println("El precio total de su compra es de: " + resultado + " euros");
    }
}
