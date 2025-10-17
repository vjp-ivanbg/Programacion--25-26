/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio14;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        int cero = 0;
        do{
            if (cero%2 == 0){
            System.out.println(cero++);
            }
            cero++;
        }while (cero <= 200);
    
    }
}
