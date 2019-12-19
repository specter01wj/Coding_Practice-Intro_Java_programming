/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_8;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestMap
public class Lab21_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Smith", 30);
        hashMap1.put("Anderson", 31);
        hashMap1.put("Lewis", 29);
        hashMap1.put("Lewis", 29);
        hashMap1.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap1 + "\n");
        
        Map<String, Integer> treeMap1 = new TreeMap<>(hashMap1);
        System.out.println("Display entries in TreeMap in ascending order of key");
        System.out.println(treeMap1 + "\n");
        
        Map<String, Integer> linkedHashMap1 = new LinkedHashMap<>(16, 0.75f, true);
        System.out.println("Display entries in LinkedHashMap");
        System.out.println(linkedHashMap1 + "\n");
        linkedHashMap1.put("Smith", 30);
        linkedHashMap1.put("Anderson", 31);
        linkedHashMap1.put("Lewis", 29);
        linkedHashMap1.put("Cook", 29);
        System.out.println(linkedHashMap1 + "\n");
        System.out.println("The age for Lewis is " + linkedHashMap1.get("Lewis"));
        
        System.out.print("\nNames and ages are: \n");
        treeMap1.forEach(
            (name, age) -> System.out.println(name + ": " + age + " ")
        );
    }
    
}
