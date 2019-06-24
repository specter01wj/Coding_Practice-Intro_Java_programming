/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_6;

/**
 *
 * @author james.wang
 */
public class Lab11_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    
    public static void m(Object x) {
        System.out.println(x.toString());
    }
    
}

class GraduateStudent extends Student {
    
}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class Person extends Object {
    public String toString() {
        return "Person";
    }
}
