package ejercicio1;

/**
 *
 * @author Andrea Martinez Diaz
 * @since 09/08/2016
 * 
 */


    /**
     * @param args the command line arguments
     */
public class Ejercicio1 {  
    
    /**
     * Fuincion organizada correctamente
     * @param args resultado
     * Imprime las letras en orden
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        
        
        while (x > 0){
        if (x > 2){
            System.out.print ("a");
        }
        
        if (x == 2){
            System.out.print("b c");
        }
        
        if (x == 1){
            System.out.print("d");
            x = x - 1;
        }
        
        
            x = x-1;
            System.out.print("-");
        } 
    }
}

