/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author james.wang
 */

// TestLinkedHashSet
public class Lab21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        set1.add("New York");
        
        System.out.println("Set: " + set1);
        
        set1.forEach(e -> System.out.print(e.toUpperCase() + " "));
    }
    
}
