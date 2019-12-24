/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_6;

import java.util.*;

/**
 *
 * @author james.wang
 */

// EfficientPrimeNumbers
public class Lab22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Find all N prime numbers: ");
        int n = input.nextInt();

        // A list to hold prime numbers
        
    }
    
    public static void efficientPrimeNumbers(int n) {
        java.util.List<Integer> list = new java.util.ArrayList<>(); 

        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int squareRoot = 1;

        System.out.println("The prime numbers are \n");
        
        while (number <= n) {
          boolean isPrime = true;

          if (squareRoot * squareRoot < number) {
              squareRoot++;
          }

          // ClosestPair if number is prime
          for (int k = 0; k < list.size() 
                            && list.get(k) <= squareRoot; k++) {
            if (number % list.get(k) == 0) { // If true, not prime
              isPrime = false; // Set isPrime to false          
              break; // Exit the for loop
            }
          }

          // Print the prime number and increase the count
          if (isPrime) {
            count++; // Increase the count
            list.add(number); // Add a new prime to the list
            if (count % NUMBER_PER_LINE == 0) {
              // Print the number and advance to the new line
              System.out.println(number);
            }
            else
              System.out.print(number + " ");
          }

          // Check if the next number is prime
          number++;
        }

        System.out.println("\n" + count + 
          " prime(s) less than or equal to " + n);
    }
    
}
