/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio21;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class Ejercicio21 {
        final static int segundosd = 86400;
        final static int segundosh = 3600;
        final static int segundosm = 60;
        final static int segundoss = 60;
        
public static void main(String[] args) {
        Scanner tiempo = new Scanner (System.in);
        
        System.out.println("Porfavor, introduzca un numero de segundos");
        
        int segundos = tiempo.nextInt();
        
        int dias = segundos / segundosd;
        
        int horas = (segundos % segundosd) / segundosh;
        
        int minutos = (segundos % segundosh) / segundosm;
        
        int segundo2 = segundos % segundosm;
        
        System.out.println(segundos + " hacen un total de: " + dias + " dias," + horas + " horas, " + minutos + " minutos y " + segundo2 + " segundos");
    }
}
