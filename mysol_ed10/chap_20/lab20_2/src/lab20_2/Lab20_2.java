/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_2;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestIterator
public class Lab20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Collection<String> arrList1 = new ArrayList<>();
        arrList1.add("New York"); 
        arrList1.add("Atlanta"); 
        arrList1.add("Dallas"); 
        arrList1.add("Madison"); 
        
        Iterator<String> iter1 = arrList1.iterator();
        while(iter1.hasNext()) {
            System.out.println(iter1.next().toUpperCase() + " ");
            
            
            
            
            
        }
    }
    
}
