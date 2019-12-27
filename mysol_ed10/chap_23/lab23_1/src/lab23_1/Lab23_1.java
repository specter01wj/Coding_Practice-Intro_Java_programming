/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab23_1;

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
    }
    
    public static void insertionSort(int[] list) {
        for(int i = 1; i < list.length; i++) {
            int currElem = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currElem; k--) {
                list[k + 1] = list[k];
            }
        }
    }
    
}
