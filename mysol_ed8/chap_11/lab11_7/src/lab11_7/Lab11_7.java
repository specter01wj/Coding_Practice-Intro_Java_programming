/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_7;

/**
 *
 * @author james.wang
 */
public class Lab11_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object object1 = new Circle4(15);
        Object object2 = new Rectangle1(10, 16);
        
        displayObject(object1);
        displayObject(object2);
        
    }
    
    public static void displayObject(Object object) {
        if(object instanceof Circle4) {
            System.out.println("Circle Area: " + ((Circle4)object).getArea() 
                + "; Diameter: " + ((Circle4)object).getDiameter());
        } else if(object instanceof Rectangle1) {
            System.out.println("Rectangle Area: " + ((Rectangle1)object).getArea());
        }
    }
    
}
