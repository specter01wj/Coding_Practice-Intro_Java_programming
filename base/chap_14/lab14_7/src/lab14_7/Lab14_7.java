/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_7;

import java.util.*;
import java.lang.*;
import java.lang.Math;
/**
 *
 * @author james.wang
 */
public class Lab14_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ComparableRectangle rectangle1 = new ComparableRectangle(10, 15);
//        ComparableRectangle rectangle2 = new ComparableRectangle(25, 35);
//        
//        System.out.println(Math.max(rectangle1, rectangle2));
        //System.out.println(rectangle1);
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(3.4, 5.4),
            new ComparableRectangle(13.24, 55.4),
            new ComparableRectangle(7.4, 35.4),
            new ComparableRectangle(1.4, 25.4)
        };
        
        java.util.Arrays.sort(rectangles);
        
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
    
    
}
