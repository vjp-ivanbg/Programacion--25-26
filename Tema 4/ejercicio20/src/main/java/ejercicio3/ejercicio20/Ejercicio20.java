/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio3.ejercicio20;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio20 {
    public final static String RESPUESTA1 = "Madrid";
    public final static String RESPUESTA2 = "Colón";
    
    public final static String PREGUNTA1 = "¿Cuál es la capital de España?";
    public final static String PREGUNTA2 = "¿Quién descubrió América?";
    
    public final static int PUNTUACION = 5;
   
    /**
     * Método que le pide al usuario
     * la respuesta a la pregunta
     * @return 
     */
    public static String pedirRespuesta() {
        Scanner entrada = new Scanner(System.in);
        String respuestaUsuario = entrada.nextLine();
        return respuestaUsuario;
    }
    /**
     * Método que compara que la respuesta del Usuario
     * con la respuesta correcta y devuelve true o false
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * 
     * true si es correcto o false si es falso
     * @return 
     */
    public static boolean comprobarRespuesta(String respuestaUsuario, String respuestaCorrecta) {
            boolean correcto;
        
            if(respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
                correcto = true;
            }else {
                correcto = false;
            }
            
        return correcto;
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       int puntuacionFinal = 0; 
       String respuesta;
       
       System.out.println("EXAMEN DE CULTURA GENERAL");
       
       System.out.println(PREGUNTA1);
       respuesta = pedirRespuesta();
       
       //Primera pregunta
       if(comprobarRespuesta(respuesta, RESPUESTA1)) {
           System.out.println("Muy bien, respuesta correcta.");
           puntuacionFinal += PUNTUACION;
       }else {
           System.out.println("No es correcto, la respuesta sería: " + RESPUESTA1);
       }  
         //Segunda pregunta  
       
       System.out.println(PREGUNTA2);
       respuesta = pedirRespuesta();
         
       if(comprobarRespuesta(respuesta, RESPUESTA2)) {
           System.out.println("Muy bien, respuesta correcta.");
           puntuacionFinal += PUNTUACION;
       }else {
           System.out.println("No es correcto, la respuesta sería: " + RESPUESTA2);
       } 
       
       System.out.println("nota final del examen: " + puntuacionFinal);
    }
}
