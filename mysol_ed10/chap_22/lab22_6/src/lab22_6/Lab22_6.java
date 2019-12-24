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
        
        efficientPrimeNumbers(n);
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

            for (int k = 0; k < list.size() && list.get(k) <= squareRoot; k++) {
                if (number % list.get(k) == 0) {
                    isPrime = false;     
                    break;
                }
            }
            
            if (isPrime) {
                count++;
                list.add(number);
                if (count % NUMBER_PER_LINE == 0) {
                  System.out.printf("%7d\n", number);
                } else
                  System.out.printf("%7d", number);
            }
            
            number++;
        }

        System.out.println("\n\n" + count + " prime(s) less than or equal to " + n);
        System.out.println("List: " + list);
    }
    
}
