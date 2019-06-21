/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_4;

/**
 *
 * @author james.wang
 */
public class Lab14_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject geoObj1 = new Circle(10);
        GeometricObject geoObj2 = new Rectangle(15, 25);
        
        System.out.println("The 2 objects same area? " + equalArea(geoObj1, geoObj2));
        
        displayGeometricObject(geoObj1);
        displayGeometricObject(geoObj2);
    }
    
    public static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }
    
    public static void displayGeometricObject(GeometricObject obj) {
        System.out.println();
        System.out.println("The area is: " + obj.getArea());
        System.out.println("The perimeter: " + obj.getPerimeter());
    }
    
}
