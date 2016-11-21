/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpsp9;

import java.util.Scanner;

/**
 *
 * @author Nabor
 */
public class Factorial extends Thread {
    public void run(){
        double factorial=1;
        double num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (double i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factoriales de "+num+" son :"+ factorial);
    }
}
