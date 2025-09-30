/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio23;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Tarea23 {
    final static float Modelouno = 344.99F;
    final static float Modelodos = 510.99F;
    final static float Modelotres = 699.99F;

    public static void main(String[] args) {
        
        Scanner bienvenida = new Scanner (System.in);
        Scanner unidad = new Scanner (System.in);
        
        System.out.println("Porfavor, introduzca el precio del modelo del ordenador que desea comprar: ");
        
        int modelo = bienvenida.nextFloat();
        
        
        System.out.println("Porfavor, introduzca el precio del modelo del ordenador que desea comprar: ");
        
        int unidades = unidad.nextFloat();
        
        float resultado = modelo * unidades;
        
        System.out.println("El precio total de su compra es: " + resultado + " euros");
    }
}
