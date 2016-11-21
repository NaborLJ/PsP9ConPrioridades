/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpsp9;

import static ejerpsp9.SumaMultiplos.aux2;
import static ejerpsp9.SumaMultiplos5.auxx2;

/**
 *
 * @author Nabor
 */
public class SumaResultados extends Thread {
  
    public void run(){
        System.out.println("Suma de ambos multiplos : "+(aux2+auxx2));
        
    }
}
