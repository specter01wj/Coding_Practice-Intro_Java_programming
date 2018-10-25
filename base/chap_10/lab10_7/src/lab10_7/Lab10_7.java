/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_7;

/**
 *
 * @author james.wang
 */
public class Lab10_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StackOfIntegers stack = new StackOfIntegers();
        
        for(int i = 0; i < 10; i++) {
            stack.push(i);
        }
        
        System.out.println("Peek: " + stack.peek());
        System.out.println("size: " + stack.getSize());
        
        while(!stack.empty()) {
            System.out.println("Pop out: " + stack.pop());
        }
        System.out.println("size after: " + stack.getSize());
    }
    
}
