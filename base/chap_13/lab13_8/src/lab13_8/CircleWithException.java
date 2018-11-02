/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_8;

/**
 *
 * @author james.wang
 */
public class CircleWithException {
    private double radius;
    private static int numOfObj = 0;
    
    public CircleWithException() {
        this(1.0);
    }
    
    public CircleWithException(double radius) {
        setRadius(radius);
        numOfObj++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if(radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Cannot be Negative!");
        }
    }

    public static int getNumOfObj() {
        return numOfObj;
    }
    
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public double getDiameter() {
        return radius * 2;
    }
    
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
    
    public void printCircle() {
        System.out.println("The circle is created at: " + getArea() + 
                ", radius is: " + radius);
    }
    
}
