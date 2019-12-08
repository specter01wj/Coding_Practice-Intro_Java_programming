/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_10;

import java.util.Scanner;

/**
 *
 * @author james.wang
 */
public class Lab18_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-neg integer: ");
        int n = input.nextInt();
        
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    
    public static long factorial(int n) {
        return factorial(n, 1);
    }
    
    private static long factorial(int n, int result) {
        if (n == 0) 
          return result;
        else
          return factorial(n - 1, n * result);
    }
    
}
