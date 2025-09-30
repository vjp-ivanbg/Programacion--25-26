/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarea16;

/**
 *
 * @author alumno
 */
public class Tarea16 {

    public static void main(String[] args) {
        int dinero = 130;
        int billetes50 = dinero/50;
        int billetes10 = dinero % 50 / 10;
        System.out.println(dinero + " euros equivalen a " + billetes50 + " billetes de 50 euros y a " + billetes10 + " billetes de 10 euros") ;
    } 
}
