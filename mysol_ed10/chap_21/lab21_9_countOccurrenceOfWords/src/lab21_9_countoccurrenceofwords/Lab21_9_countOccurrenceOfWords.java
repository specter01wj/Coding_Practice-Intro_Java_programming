/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_9_countoccurrenceofwords;

import java.util.*;

/**
 *
 * @author james.wang
 */

// CountOccurrenceOfWords
public class Lab21_9_countOccurrenceOfWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        
//        Map<String, Integer> map1 = new TreeMap<>();
        
        String[] words = text.split("[\\s+\\p{P}]");
        
        Map map1 = countOccurrenceOfWords(words);
        System.out.println("Map: " + map1);
        map1.forEach((k, v) -> System.out.println(k + "\t" + v));
        
    }
    
    public static Map<String, Integer> countOccurrenceOfWords(String[] words) {
        Map<String, Integer> map2 = new TreeMap<>();
        
        for(int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            
            if(key.length() > 0) {
                if(!map2.containsKey(key)) {
                    map2.put(key, 1);
                } else {
                    int value = map2.get(key);
                    value++;
                    map2.put(key, value);
                }
            }
        }
        
        return map2;
    }
    
}
