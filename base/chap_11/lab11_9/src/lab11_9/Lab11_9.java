/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_9;

import java.util.*;
/**
 *
 * @author james.wang
 */
public class Lab11_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}

class MyStack {
    
    private ArrayList list = new ArrayList();
        
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    public int search(Object o) {
        return list.lastIndexOf(o);
    }

    public String toString() {
        return "stack: " + list.toString();
    }
    
}
