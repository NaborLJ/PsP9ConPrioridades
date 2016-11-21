
package ejerpsp9;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import static java.lang.Thread.NORM_PRIORITY;

/**
 *
 * @author Nabor
 */
public class EjerPsP9 {

   
    public static void main(String[] args) {
        SumaMultiplos hilo1 = new SumaMultiplos();
        SumaMultiplos5 hilo2= new SumaMultiplos5();
        Factorial hilo3 = new Factorial();
        SumaResultados hilo4 =new SumaResultados();
        hilo1.setPriority(MAX_PRIORITY);
        hilo2.setPriority(MAX_PRIORITY);
        hilo3.setPriority(NORM_PRIORITY);
        hilo4.setPriority(MIN_PRIORITY);
        hilo2.start();
        hilo1.start();
        hilo4.start();
        hilo3.start();
       
        
    }
    
}
