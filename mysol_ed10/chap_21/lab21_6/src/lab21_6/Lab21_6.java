/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_6;

import java.util.*;

/**
 *
 * @author james.wang
 */

// SetListPerformanceTest
public class Lab21_6 {
    
    static final int N = 5000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list1.add(i);
        }
        System.out.println("List1: " + list1);
        Collections.shuffle(list1);
        System.out.println("Shuffle List1: " + list1);
        
        Collection<Integer> set1 = new HashSet<>(list1);
        System.out.println("Set1: " + set1);
        System.out.println("Member test time for hash set is " + getTestTime(set1) + " milliseconds");
        System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + " milliseconds");
        
        Collection<Integer> set2 = new LinkedHashSet<>(list1);
        System.out.println("Member test time for linked hash set is " + getTestTime(set2) + " milliseconds");
        System.out.println("Remove element time for linked hash set is " + getRemoveTime(set2) + " milliseconds");
        
        Collection<Integer> set3 = new TreeSet<>(list1);
        System.out.println("Member test time for tree set is " + getTestTime(set3) + " milliseconds");
        System.out.println("Remove element time for tree set is " + getRemoveTime(set3) + " milliseconds");
        
        Collection<Integer> list2 = new ArrayList<>(list1);
        System.out.println("Member test time for array list is " + getTestTime(list2) + " milliseconds");
        System.out.println("Remove element time for array list is " + getRemoveTime(list2) + " milliseconds");
        
        Collection<Integer> list3 = new LinkedList<>(list1);
        System.out.println("Member test time for linked list is " + getTestTime(list3) + " milliseconds");
        System.out.println("Remove element time for linked list is " + getRemoveTime(list3) + " milliseconds");
        
    }
    
    public static long getTestTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < N; i++) {
            c.contains((int)(Math.random() * 2 * N));
        }

        return System.currentTimeMillis() - startTime; 
    }
    
    public static long getRemoveTime(Collection<Integer> c) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            c.remove(i);
        }

        return System.currentTimeMillis() - startTime; 
    }
    
}
