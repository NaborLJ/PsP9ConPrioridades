
package ejerpsp9;

/**
 *
 * @author Nabor
 */
public class SumaMultiplos extends Thread {
    
    public static int aux=0;
    public static int aux2=0;
    public void run(){
        
        
        for(int aux = 0; aux<1000;aux++){
            if((aux%3)==0){
                aux2=aux2+aux;
                
            }
        }   
        
        System.out.println("Suma de multiplos de 3 : "+aux2);
                
                
                
    }
}
