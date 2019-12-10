/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_7_wildcardneeddemo;

import lab19_7_wildcardneeddemo.GenericStack;

/**
 *
 * @author james.wang
 */

// WildCardNeedDemo
public class Lab19_7_wildCardNeedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1); // 1 is autoboxed into new Integer(1)
        intStack.push(2);
        intStack.push(-2);
    }
    
    public static double max(GenericStack<Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max

        while (!stack.isEmpty()) {
          double value = stack.pop().doubleValue();
          if (value > max) {
            max = value;
          }
        }

        return max;
   }
    
}
