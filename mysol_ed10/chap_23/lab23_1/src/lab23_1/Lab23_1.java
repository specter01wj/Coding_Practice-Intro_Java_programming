/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23_1;

import java.util.Arrays;

/**
 *
 * @author james.wang
 */

// InsertionSort
public class Lab23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] list = {1, 9, 4, 7, 14, 45, 6, 13, 100, 3};
        System.out.println("Origin List: " + Arrays.toString(list));
        
        insertionSort(list);
        System.out.println("Sorted List: " + Arrays.toString(list));
    }
    
    public static void insertionSort(int[] list) {
        for(int i = 1; i < list.length; i++) {
            int currElem = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currElem; k--) {
                list[k + 1] = list[k];
            }
            
            list[k + 1] = currElem;
        }
    }
    
}
