
package com.jinwang.lab27_1_testmyhashmap;


public class Lab27_1_TestMyHashMap {

    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyHashMap<>();

        map.put("Smith", 30);
        map.put("Anderson", 31);
        map.put("Lewis", 29);
        map.put("Cook", 29);
        map.put("Smith", 65); // overwrite

        System.out.println("Initial map entries:");
        System.out.println(map);

        System.out.println("\nGet value by key:");
        
        
        System.out.println("Lewis -> " + map.get("Lewis"));

        System.out.println("\nKey / Value checks:");
        System.out.println("Contains key 'Smith'? " + map.containsKey("Smith"));
        System.out.println("Contains value 33? " + map.containsValue(33));

        map.remove("Smith");
        System.out.println("\nAfter removing 'Smith':");
        System.out.println(map);

        map.clear();
        System.out.println("\nAfter clear():");
        System.out.println(map);
    }
}
