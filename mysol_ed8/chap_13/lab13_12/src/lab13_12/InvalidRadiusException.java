/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_12;

/**
 *
 * @author jinwang
 */
public class InvalidRadiusException extends Exception {
    
    private double radius;
    
    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
}
