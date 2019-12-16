/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab21_5;

import lab21_5.GeometricObject;
import lab21_5.Circle;
import lab21_5.Rectangle;
import lab21_5.GeometricObjectComparator;
import java.util.*;

/**
 *
 * @author james.wang
 */

// TestTreeSetWithComparator
public class Lab21_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
        set.add(new Rectangle(4, 5));
        set.add(new Circle(40));
        set.add(new Circle(40));
        set.add(new Rectangle(4, 1));

        // Display geometric objects in the tree set
        System.out.println("A sorted set of geometric objects");
        for (GeometricObject element: set)
          System.out.println("area = " + element.getArea());
    }
    
}
