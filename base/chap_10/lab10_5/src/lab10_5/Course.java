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
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numOfStud;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumOfStud() {
        return numOfStud;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void addStudent(String student) {
        students[numOfStud] = student;
        numOfStud++;
    }
    
    public void dropStudent(String student) {
        
    }
    
}
