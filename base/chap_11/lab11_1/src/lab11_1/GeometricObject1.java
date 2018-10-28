/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_1;

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
        this.filled = filled;
        this.dateCreated = new java.util.Date();
        this.filled = filled;
    }
    
    
    
}
