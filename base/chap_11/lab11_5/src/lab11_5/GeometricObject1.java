/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_5;

import java.util.Date;

/**
 *
 * @author jinwang
 */
public class GeometricObject1 {
    
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    public GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject1(String color, boolean filled) {
        this.color = color;
        this.dateCreated = new java.util.Date();
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString() {
        return "created on: " + dateCreated + "\ncolor: " + color 
                + " and filled: " + filled;
    }
    
}
