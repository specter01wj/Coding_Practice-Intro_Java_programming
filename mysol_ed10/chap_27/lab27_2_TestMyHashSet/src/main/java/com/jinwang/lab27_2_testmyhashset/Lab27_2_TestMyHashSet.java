
package com.jinwang.lab27_2_testmyhashset;


public class Lab27_2_TestMyHashSet {

    public static void main(String[] args) {
         MySet<String> set = new MyHashSet<>();

        set.add("Smith");
        set.add("Anderson");
        set.add("Lewis");
        set.add("Cook");
        set.add("Smith"); // duplicate

        System.out.println("Elements in set: " + set);
        System.out.println("Number of elements: " + set.size());
        System.out.println("Contains Smith? " + set.contains("Smith"));

        set.remove("Smith");

        System.out.print("Names in uppercase: ");
        for (String s : set) {
          System.out.print(s.toUpperCase() + " ");
        }

        set.clear();
        System.out.println("\nElements in set: " + set);
    }
}
