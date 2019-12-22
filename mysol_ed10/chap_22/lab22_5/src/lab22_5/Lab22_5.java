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

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers are:");

        // Repeatedly find prime numbers
        while (number <= n) {
            
            
            
            
          // Assume the number is prime
          boolean isPrime = true; // Is the current number prime?

          // ClosestPair if number is prime
          for (int divisor = 2; divisor <= (int)(Math.sqrt(number)); 
              divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
              isPrime = false; // Set isPrime to false          
              break; // Exit the for loop
            }
          }

          // Print the prime number and increase the count
          if (isPrime) {
            count++; // Increase the count

            if (count % NUMBER_PER_LINE == 0) {
              // Print the number and advance to the new line
              System.out.printf("%7d\n", number);
            }
            else
              System.out.printf("%7d", number);
          }

          // Check if the next number is prime
          number++;
        }

        System.out.println("\n" + count + 
          " prime(s) less than or equal to " + n);
    }
    
}
