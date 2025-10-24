/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4.utilidades;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class Utilidades {
    
    public static int pedirnumero() {
        int num = -1;
        
        try {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        
        } catch(InputMismatchException e) {
            System.out.println("Has introducido mal el numero");
        }
        return num;
     }
}
