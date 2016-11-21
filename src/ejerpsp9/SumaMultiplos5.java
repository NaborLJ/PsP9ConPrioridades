/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpsp9;

/**
 *
 * @author Nabor
 */
public class SumaMultiplos5  extends Thread{
   public static int aux=0;
   public static int auxx2=0;
    public void run(){
        
        for(int aux = 0; aux<=1000;aux++){
            if((aux%5)==0){
                auxx2=auxx2+aux;
                
            }
        }   
        
        System.out.println("Suma de multiplos de 5: "+auxx2);
                
                
                
    }
}
