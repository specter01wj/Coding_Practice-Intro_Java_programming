/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_7;

/**
 *
 * @author james.wang
 */
public class ComparableRectangle extends Rectangle {
    
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    
    public int compareTo(Object o) {
        if(getArea() > ((ComparableRectangle)o).getArea())
            return 1;
        else if(getArea() < ((ComparableRectangle)o).getArea())
            return -1;
        else
            return 0;
    }
    
}
