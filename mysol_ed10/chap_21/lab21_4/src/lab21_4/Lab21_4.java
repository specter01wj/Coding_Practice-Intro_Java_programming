/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_4;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestTreeSet
public class Lab21_4 {

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
        
        TreeSet<String> treeSet1 = new TreeSet<>(set1);
        System.out.println("Sorted tree set1: " + treeSet1);
        
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("China");
        set2.add("USA");
        set2.add("Taiwan");
        System.out.println("set2: " + set2);
        
        
    }
    
}
