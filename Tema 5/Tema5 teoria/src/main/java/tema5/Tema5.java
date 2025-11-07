/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tema5;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Tema5 {

    public static void main(String[] args) {
        // 1. Instancio un objeto del tipo que he creado
        // 1.1 Con constructor parametrizado y establecido con setters
        Coche miCoche = new Coche ();
        System.out.println(miCoche.toString());
        
        miCoche.setEspejos(5);
        System.out.println(miCoche.toString());
        
        System.out.println(miCoche.getEspejos());
        
        miCoche.acelerar();
        
        
        // 1.2 Con constructor parametrizado, iniciando los atributos
        // con los valores pasados por parámetro
        Coche tuCoche = new Coche(" Michelin", " Bajo", 3);
        System.out.println(tuCoche.toString());
        
        // Esto hace lo mismo que la línea anterior, porque detecta el toString() automáticamente
        System.out.println(tuCoche);
        
        System.out.println(tuCoche.getRuedas());
    }
}
