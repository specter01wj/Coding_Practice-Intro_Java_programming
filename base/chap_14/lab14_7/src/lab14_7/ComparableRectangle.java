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
public class ComparableRectangle extends Rectangle implements Comparable {
    
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }
    
    @Override
    public int compareTo(Object o) {
        if(getArea() > ((ComparableRectangle)o).getArea())
            return 1;
        else if(getArea() < ((ComparableRectangle)o).getArea())
            return -1;
        else
            return 0;
    }
    
    @Override // Implement the toString method in GeometricObject
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
    
}
