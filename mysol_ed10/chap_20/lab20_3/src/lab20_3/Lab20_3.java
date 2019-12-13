/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_3;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestArrayAndLinkedList
public class Lab20_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> arrList1 = new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);
        arrList1.add(1);
        arrList1.add(4);
        arrList1.add(0, 10);
        arrList1.add(3, 30);
        
        System.out.println("A list of integers in the array list:");
        System.out.println(arrList1);
    }
    
}
