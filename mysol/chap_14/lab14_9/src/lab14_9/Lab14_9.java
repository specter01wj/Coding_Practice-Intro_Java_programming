/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_9;

/**
 *
 * @author james.wang
 */
public class Lab14_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();
        house2.setArea(385.75);
        
        System.out.println("house1: " + house1.getArea());
        System.out.println("house2: " + house2.getArea());
    }
    
}
