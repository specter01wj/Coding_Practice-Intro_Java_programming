/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_1;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestCollection
public class Lab20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> arrList1 = new ArrayList<>();
        arrList1.add("New York");
        arrList1.add("Atlanta");
        arrList1.add("Dallas");
        arrList1.add("Baltimore");
        
        System.out.println("A List of collection1: ");
        System.out.println(arrList1);
        System.out.println("Dallas? - " + arrList1.contains("Dallas"));
        
        
    }
    
}
