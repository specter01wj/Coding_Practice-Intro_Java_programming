/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_6;

import java.util.*;
import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab13_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        
        do {
            try {
                System.out.println("Enter a integer: ");
                int num = input.nextInt();
                System.out.println("The num is: " + num);
                continueInput = false;
            }
            catch(InputMismatchException ex) {
                System.out.println("Incorrect input!");
                input.nextLine();
            }
        } while(continueInput);
        
    }
    
}
