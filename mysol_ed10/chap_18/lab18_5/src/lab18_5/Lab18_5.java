/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_5;

/**
 *
 * @author james.wang
 */
public class Lab18_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }
    
    public static void sort(double[] list, int low, int high) {
        if(low < high) {
            int indexOfMin = low;
            double min = list[low];
            
            for(int i = low + 1; i <= high; i++) {
                if(list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            
            list[indexOfMin] = list[low];
            list[low] = min;
            
            sort(list, low + 1, high);
        }
    }
    
}
