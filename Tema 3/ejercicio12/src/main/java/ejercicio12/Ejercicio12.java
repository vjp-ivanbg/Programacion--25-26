/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio12;

/**
 *
 * @author alumno
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
        int once = 11;
        
        
        do{
            if (once%2 == 0){
            System.out.println(once++);
            }
            once++;
        }while (once < 133);
    }
}

