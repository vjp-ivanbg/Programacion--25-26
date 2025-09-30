/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package caritmetica.tema2;

/**
 *
 * @author alumno
 */
public class Tema2 {
    //ATRIBUTOS
    int vida = 100;
    int niveles = 100;
    String genero = "RPG"; //el String guarda nombres y el int numeros
            
    //METODOS
       public static void iniciar() {
           System.out.println ("Iniciando juego...");
       }
       
       public static void mostrarMenu () {
           System.out.println("- MENU -");
           System.out.println("INICIA");
           System.out.println("Seleccionar nivel");
           System.out.println("Opciones");
           System.out.println("Salir");
       }
       
       //METODO PRINCIPAL (MAIN)
       /**
        * @param args the comand line arguments
        */
        public static void main (String[] args) {
            //VARIABLES
            int tiempoEspera = 3;
            
            float notaMedia = 6.8F;
            
            //Declarar Variable
            char letraDNI;
           
            //Inicializar la variable
            letraDNI = 'A';
            
            //Declarar e inicializar una variable
            boolean encontrado = false;
            
            //Declarar varias variables en la misma linea
            int edad = 3, niveles = 100, vida = 100;
            
            System.out.println(letraDNI);
            
            //LLAMAR A METODOS
            iniciar();
        }
        
    
}
