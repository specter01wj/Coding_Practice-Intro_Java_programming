/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_5;

/**
 *
 * @author james.wang
 */
public class Lab9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length != 3) {
            System.out.println("Usage: operand1 operator operand2");
            System.exit(0);
        }
        
        int result = 0;
        
        switch(args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '*':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
            default:
                result = 0;
        }
        
        System.out.println("The result of " + args[0] + " " + args[1] + " " + args[2] + " = " + result);
        
    }
    
}
