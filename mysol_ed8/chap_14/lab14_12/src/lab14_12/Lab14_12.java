/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_12;

/**
 *
 * @author james.wang
 */
public class Lab14_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rational r1 = new Rational(4, 2);
        Rational r2 = new Rational(2, 3);
        
        Rational r3 = new Rational(1, 123456789);
        
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
        
        System.out.println("r1 * r2 * r3 is: " + r1.multiply(r2.multiply(r3)));
    }
    
}
