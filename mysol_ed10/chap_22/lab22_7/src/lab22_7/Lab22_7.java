/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_7;

import java.util.*;

/**
 *
 * @author james.wang
 */

// SieveOfEratosthenes
public class Lab22_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Find all N prime numbers: ");
        int n = input.nextInt();

        sieveOfEratosthenes(n);
        
    }
    
    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true; 
        }

        for (int k = 2; k <= n / k; k++) {
            if (primes[k]) {
                for (int i = k; i <= n / k; i++) {
                    primes[k * i] = false;
                }
            }
        }

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%7d\n", i);
                } else {
                    System.out.printf("%7d", i);  
                }
            }
        }

        System.out.println("\n\n" + count + " prime(s) less than or equal to " + n);
        System.out.println("Primes: " + Arrays.toString(primes));
    }
    
}
