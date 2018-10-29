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
public class Circle4 extends GeometricObject1 {
    
    private double radius;
    
    public Circle4() {
        
    }
    
    public Circle4(double radius) {
        this.radius = radius;
    }
    
    public Circle4(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    
}
