/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_4;

import java.util.*;

/**
 *
 * @author james.wang
 */

// GCDEuclid
public class Lab22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int m = input.nextInt();
        
        
        
        
        
        
        System.out.print("Enter second integer: ");
        int n = input.nextInt();

        System.out.println("The greatest common divisor for " + 
                m + " and " + n + " is " + gcd(m, n));
    }
    
    public static int gcd(int m, int n) {
        if(m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
    
}
