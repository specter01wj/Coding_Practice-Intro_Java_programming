/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_5;

/**
 *
 * @author james.wang
 */
public class Lab10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Course course1 = new Course("FPGA");
        Course course2 = new Course("DSP");
        
        course1.addStudent("James Wang");
        course1.addStudent("David Ken");
        course1.addStudent("Sam Joren");
        
        course2.addStudent("Jin Wang");
        course2.addStudent("King Steve");
        
        System.out.println("Num of students in C1: " + course1.getNumOfStud());
        String[] students1 = course1.getStudents();
        for(int i = 0; i < course1.getNumOfStud(); i++) {
            System.out.println("Stud: " + students1[i]);
        }
        
        System.out.println("Num of students in C2: " + course2.getNumOfStud());
        String[] students2 = course2.getStudents();
        for(int i = 0; i < course2.getNumOfStud(); i++) {
            System.out.println("Stud: " + students2[i]);
        }
    }
    
}
