/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_3;

/**
 *
 * @author james.wang
 */
public class Lab10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMI bmi1 = new BMI("James Wang", 37, 163, 70);
        System.out.println("BMI for " + bmi1.getName() + ": " + bmi1.getBMI() + " / " + bmi1.getStatus());
        
        BMI bmi2 = new BMI("Mike Brand", 210, 76);
        System.out.println("BMI for " + bmi2.getName() + " age-" + bmi2.getAge() + ": " + bmi2.getBMI() + " / " + bmi2.getStatus());

    }
    
}

