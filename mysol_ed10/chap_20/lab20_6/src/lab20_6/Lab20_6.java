/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_6;

import java.util.*;

/**
 *
 * @author james.wang
 */

// TestQueue
public class Lab20_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");
        
        System.out.println("Queue1: " + queue1);
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
    }
    
}
