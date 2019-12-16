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
    }
    
}
