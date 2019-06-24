/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_7;

/**
 *
 * @author jinwang
 */
public class Rectangle1 extends GeometricObject1 {
    
    private double width, height;
    
    public Rectangle1() {
        
    }
    
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle1(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getDiameter() {
        return (width + height) * 2;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}
