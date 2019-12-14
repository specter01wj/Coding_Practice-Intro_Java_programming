/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20_4;

import lab20_4.GeometricObject;
import lab20_4.Rectangle;
import lab20_4.Circle;
import java.util.Comparator;

/**
 *
 * @author james.wang
 */

// TestComparator
public class Lab20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject g1 = new Rectangle(5, 5);
        GeometricObject g2 = new Circle(5);
        
        GeometricObject g = max(g1, g2, new GeometricObjectComparator());
        
        System.out.println("The area of the larger object is " + g.getArea());
    }
    
    public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
        if (c.compare(g1, g2) > 0) {
          return g1;
        } else {
          return g2;
        }
    }
    
}
