/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tarea15;

/**
 *
 * @author alumno
 */
public class Tarea15 {
    final static int SEGUNDOSH = 3600;
    final static int SEGUNDOSM = 60;
    

    public static void main(String[] args) {
        int tiempo = 10000;
        
        int horas = tiempo/3600;
        
        int minutos = tiempo% SEGUNDOSH / SEGUNDOSM;
        
        int segundos = tiempo% SEGUNDOSM;
        
        System.out.println(tiempo +" segundos hacen un total de:"+ horas + "horas," + minutos +"minutos " + segundos + " segundos");
    } 
}
