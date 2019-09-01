/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15_test_13;

/**
 *
 * @author james.wang
 */
public class Lab15_test_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lab15_test_13 test = new Lab15_test_13();
        test.setAction1( () -> System.out.println("Action 1!"));
        test.setAction2( e -> System.out.println(e + " "));
        System.out.println(test.setAction3(e -> e * 2));
    }
    
    public void setAction1(T1 t) {
        t.m();
    }
    public void setAction2(T2 t) {
        t.m(4.5);
    }
    public double setAction3(T3 t) {
        return t.m(5.5);
    }
}

interface T1 {
    public void m();
}

interface T2 {
    public void m(Double d);
}

interface T3 {
    public double m(Double d);
}
