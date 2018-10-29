/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_5;

/**
 *
 * @author jinwang
 */
public class Lab11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        displayObject(new Circle4(15, "red", true));
        displayObject(new Rectangle1(13, 16, "purple", false));
    }
    
    public static void displayObject(GeometricObject1 object) {
        System.out.println("Created on: " + object.getDateCreated() 
            + "; Color is: " + object.getColor());
    }
    
}
