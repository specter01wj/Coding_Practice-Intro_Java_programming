/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_9_superwildcarddemo;

import lab19_9_superwildcarddemo.GenericStack;

/**
 *
 * @author james.wang
 */

// SuperWildCardDemo
public class Lab19_9_superWildCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<String> stack1 = new GenericStack<String>();
        GenericStack<Object> stack2 = new GenericStack<Object>();
        
        stack2.push("Java");
        stack2.push(2);
        stack1.push("Sun");
        
        add(stack1, stack2);
        
        AnyWildCardDemo.print(stack2);
    }
    
    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    
}
