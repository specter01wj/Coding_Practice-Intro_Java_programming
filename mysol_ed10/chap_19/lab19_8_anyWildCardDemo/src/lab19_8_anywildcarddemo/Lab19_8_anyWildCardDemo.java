/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_8_anywildcarddemo;

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
    }
    
    public static void print(GenericStack<?> stack) {
        while (!stack.isEmpty()) {
          System.out.print(stack.pop() + " ");
        }
    }
    
}
