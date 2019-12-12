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
        
        System.out.println("A List1 of collection1: ");
        System.out.println(arrList1);
        System.out.println("Dallas? - " + arrList1.contains("Dallas"));
        
        System.out.println("Before: " + arrList1.size() + " cities.");
        arrList1.remove("Dallas");
        System.out.println("After: " + arrList1.size() + " cities.");
        
        System.out.println("");
        
        Collection<String> arrList2 = new ArrayList<>();
        arrList2.add("Seattle"); 
        arrList2.add("Portland"); 
        arrList2.add("Los Angles"); 
        arrList2.add("Boston"); 
        arrList2.add("Baltimore"); 
        
        System.out.println("A List2 of collection1: ");
        System.out.println(arrList2);
        
        ArrayList<String> c1 = (ArrayList<String>)(arrList1.clone());
        c1.addAll(arrList2);
        System.out.println("Cities in collection1 or collection2: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(arrList1.clone());
        c1.retainAll(arrList2);
        System.out.print("Cities in collection1 and collection2: ");
        System.out.println(c1);
        
        c1 = (ArrayList<String>)(arrList1.clone());
        c1.removeAll(arrList2);
        System.out.print("Cities in collection1, but not in 2: ");
        System.out.println(c1);
        
        
    }
    
}
