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
public class BMI {
    private String name; 
    private int age; 
    private double weight, height;
    public static final double KILO_PER_POUND = 0.454, METER_PER_ICH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public BMI(String name, double weight, double height) {
        this(name, 25, weight, height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    
    public double getBMI() {
        double bmi = weight * KILO_PER_POUND / ((height * METER_PER_ICH) * (height * METER_PER_ICH));
        return Math.round(bmi * 100) / 100.0;
    }
    
    public String getStatus() {
        double bmi = getBMI();
        
        if(bmi < 16) return "lv1: too skinny!!";
        else if(bmi < 18) return "lv2: underweight!";
        else if(bmi < 24) return "lv3: normal!";
        else if(bmi < 29) return "lv4: overweight!";
        else if(bmi < 35) return "lv5: too fat!";
        else return "lv6: dying!!!";
    }
    
}
