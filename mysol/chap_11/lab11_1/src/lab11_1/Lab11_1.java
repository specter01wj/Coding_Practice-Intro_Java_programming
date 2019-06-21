/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_1;

/**
 *
 * @author jinwang
 */
public class Lab11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circle4 circle = new Circle4(10);
        System.out.println("This circle: " + circle.toString());
        System.out.println("The radius: " + circle.getRadius() + "; The area: " 
                + circle.getArea() + "; The diameter: " + circle.getDiameter());
        
        Rectangle1 rectangle = new Rectangle1(12, 15);
        System.out.println("This rectangle: " + rectangle.toString());
        System.out.println("The area: " + rectangle.getArea() + 
                "; The diameter: " + rectangle.getDiameter());
    }
    
}
