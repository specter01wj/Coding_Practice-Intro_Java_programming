/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab19_3;

import lab19_3.Circle;
import lab19_3.GeometricObject;
import lab19_3.Rectangle;

/**
 *
 * @author james.wang
 */

// BoundedTypeDemo
public class Lab19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec1 = new Rectangle(2, 2);
        Circle cir1 = new Circle(2);
        
        System.out.println("Same area? " + equalArea(rec1, cir1));
    }
    
    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }
    
}
