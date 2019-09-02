/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_10;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author james.wang
 */
public class Lab15_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DoubleProperty balance = new SimpleDoubleProperty();
        
        balance.addListener(new InvalidationListener() {
            public void invalidated(Observable ov) {
                System.out.println("The new value is: " + balance.doubleValue());
            }
        });
        
        balance.set(4.5);
        balance.set(15.5);
    }
    
}
