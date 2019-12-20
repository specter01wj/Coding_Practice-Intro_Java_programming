/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab22_1;

/**
 *
 * @author james.wang
 */

// PerformanceTest
public class Lab22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getTime(1000000);
        getTime(10000000);
        getTime(100000000);
        getTime(1000000000);
    }
    
    public static void getTime(long n) {
        long startTime = System.currentTimeMillis();
        long k = 0;
        for(int i = 1; i <= n; i++) {
            k = k + 5;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time for n = " + n 
            + " is " + (endTime - startTime) + " milliseconds");
    }
    
}
