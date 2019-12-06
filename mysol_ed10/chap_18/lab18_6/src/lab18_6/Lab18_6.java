/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_6;

/**
 *
 * @author james.wang
 */

// RecursiveBinarySearch
public class Lab18_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }
    
    public static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        
    }
    
}
