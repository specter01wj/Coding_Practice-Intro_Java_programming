/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_7_wildcardneeddemo;

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
