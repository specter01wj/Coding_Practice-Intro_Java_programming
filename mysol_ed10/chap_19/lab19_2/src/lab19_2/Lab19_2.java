/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_2;

/**
 *
 * @author james.wang
 */

// GenericMethodDemo
public class Lab19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] int1 = {1, 2, 3, 4, 5};
        String[] str1 = {"London", "Paris", "New York", "Austin"};
        
        Lab19_2.<Integer>print(int1);
        Lab19_2.<String>print(str1);
    }
    
    public static <E> void print(E[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]+ " ");
        }
    }
    
}
