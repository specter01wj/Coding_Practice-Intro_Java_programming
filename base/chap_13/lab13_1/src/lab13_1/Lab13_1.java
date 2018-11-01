/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_1;

import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 2 int: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        
        System.out.println("result: " + num1 + " / " + num2 + " = " + (num1/num2));
        
    }
    
}
