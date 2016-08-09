/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Estudiante
 */
public class ejercicio2 {
    public static void main (String [] args) {
        int x = 0; 
        int y = 0;
        while (x < 5){
            
            //y = x-y;
            // Respuesta: 00 11 21 32 42
            
            //y = y + x;
            //Respuesta: 00 11 23 36 410 
            
            
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
    
}
