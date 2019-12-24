/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_5;

import java.util.*;

/**
 *
 * @author james.wang
 */

// PrimeNumbers
public class Lab22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Find n prime numbers: ");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        int n = input.nextInt();
        
        findPrimes(n);
    }
    
    public static void findPrimes(int n) {
        
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers are:");
        
        while (number <= n) {
            boolean isPrime = true;
            
            for(int divisor = 2; divisor <= (int)(Math.sqrt(number)); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;        
                    break;
                }
            }
            
            if (isPrime) {
                count++;

                if (count % NUMBER_PER_LINE == 0) {
                    System.out.printf("%7d\n", number);
                } else {
                    System.out.printf("%7d", number);
                }
            }
            
            number++;
        }

        System.out.println("\n" + count + " primes less than or equal to " + n);
    }
    
}
