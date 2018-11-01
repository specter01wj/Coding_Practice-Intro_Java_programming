/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_4;

import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 int: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        
        try {
            int result = quotient(num1, num2);
            System.out.println("result: " + num1 + " / " + num2 + " = " + result);
        }
        catch(ArithmeticException ex) {
            System.out.println("Exception: can't divided by 0!!!");
        }
            
        System.out.println("Excution continues....");
    }
    
    public static int quotient(int num1, int num2) {
        if(num2 == 0) {
            throw new ArithmeticException("Divisor can't be 0!");
        }
        return num1 / num2;
    }
    
}
