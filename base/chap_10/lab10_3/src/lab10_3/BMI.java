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
    
    
    
}
