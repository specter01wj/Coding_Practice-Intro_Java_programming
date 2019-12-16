/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_2;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestMethodsInCollection
public class Lab21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> set1 = new HashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        
        System.out.println("set1 is: " + set1);
        System.out.println(set1.size() + " elements in set1");
        
        set1.remove("London");
        System.out.println("After remove set1 is: " + set1);
        System.out.println(set1.size() + " elements in set1");
        
        System.out.println();
        
        Set<String> set2 = new HashSet<>();
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("set2 is: " + set2);
        System.out.println(set2.size() + " elements in set2");
        
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);

        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 from set1, set1 is " + set1);
    }
    
}
