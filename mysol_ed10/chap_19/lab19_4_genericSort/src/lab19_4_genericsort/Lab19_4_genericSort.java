/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_4_genericsort;

/**
 *
 * @author james.wang
 */

// GenericSort
public class Lab19_4_genericSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)}; 
        Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};
        String[] stringArray = {"Tom", "Susan", "Kim"};
        
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
    
}
