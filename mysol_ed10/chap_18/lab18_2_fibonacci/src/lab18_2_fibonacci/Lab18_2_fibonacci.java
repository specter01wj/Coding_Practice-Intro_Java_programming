/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_2_fibonacci;

import java.util.Scanner;

/**
 *
 * @author james.wang
 */
public class Lab18_2_fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter index for Fibonacci: ");
        int index = input.nextInt();
        
        System.out.println("Fibonacci number at index: " + index + " is: " + fib(index));
    }
    
    public static long fib(long index) {
        if(index == 0) {
            return 0;
        } else if(index == 1) {
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }
    
}
