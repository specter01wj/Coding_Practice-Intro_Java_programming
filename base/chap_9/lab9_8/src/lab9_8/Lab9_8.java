/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_8;

import java.util.Scanner;
/**
 *
 * @author james.wang
 */
public class Lab9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        java.io.File file = new java.io.File("scores.txt");
        Scanner input = new Scanner(file);
        
        while(input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println("Output: " + firstName + " " + mi + " " + lastName + " " + score);
        }
        
        input.close();
    }
    
}


