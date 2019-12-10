/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_8_anywildcarddemo;

import lab19_8_anywildcarddemo.GenericStack;

/**
 *
 * @author james.wang
 */

// AnyWildCardDemo
public class Lab19_8_anyWildCardDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);

        print(intStack);
    }
    
    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
          System.out.print(stack.pop() + " ");
        }
        System.out.println("");
    }
    
}
