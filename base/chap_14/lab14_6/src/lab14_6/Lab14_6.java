/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_6;

/**
 *
 * @author james.wang
 */
public class Lab14_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}

class Animal {
    
}

class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "Hot pot! Eat";
    }
}

class Tiger extends Animal {
    
}

abstract class Fruit implements Edible {
    
}

class Apple extends Fruit {
    public String howToEat() {
        return "Swallow! Eat";
    }
}

class Orange extends Fruit {
    public String howToEat() {
        return "Make Juice! Eat";
    }
}
