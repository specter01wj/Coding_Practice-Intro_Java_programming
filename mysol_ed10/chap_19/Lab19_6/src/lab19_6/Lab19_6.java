/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_6;

/**
 *
 * @author james.wang
 */

// MaxUsingGenericType
public class Lab19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Lab19_6.max("James", 23));
    }
    
    public static <E extends Comparable<E>> E max(E o1, E o2) {
        if (o1.compareTo(o2) > 0) {
          return o1;
        } else {
          return o2;
        }
    }
    
}
