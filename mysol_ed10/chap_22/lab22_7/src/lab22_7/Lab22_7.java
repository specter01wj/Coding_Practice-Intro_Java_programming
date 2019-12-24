/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_7;

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
        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = input.nextInt();

        boolean[] primes = new boolean[n + 1]; // Prime number sieve

        // Initialize primes[i] to true
        for (int i = 0; i < primes.length; i++) {
          primes[i] = true; 
        }

        for (int k = 2; k <= n / k; k++) {
          if (primes[k]) {
            for (int i = k; i <= n / k; i++) {
              primes[k * i] = false; // k * i is not prime
            }
          }
        }

        final int NUMBER_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers found so far
        // Print prime numbers
        for (int i = 2; i < primes.length; i++) {
          if (primes[i]) {
            count++;
            if (count % 10 == 0) 
              System.out.printf("%7d\n", i);
            else
              System.out.printf("%7d", i);          
          }
        }

        System.out.println("\n" + count + 
          " prime(s) less than or equal to " + n);
    }
    
}
