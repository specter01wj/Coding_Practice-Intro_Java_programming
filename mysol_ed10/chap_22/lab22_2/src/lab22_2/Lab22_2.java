/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_2;

import java.util.Scanner;

/**
 *
 * @author james.wang
 */

// ImprovedFibonacci
public class Lab22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();
        
        System.out.println("Fibonacci number at index " + index + " is " + fib(index));
    }
    
}
