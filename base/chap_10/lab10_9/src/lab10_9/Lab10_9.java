/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_9;

import java.util.*;
/**
 *
 * @author james.wang
 */
public class Lab10_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int date = 0, answer;
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Is your DOB in Set - " + (i+1) + " ?");
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 4; k++) {
                    System.out.print(GuessDate.getValue(i, j, k) + " ");
                }
                System.out.println();
            }
            
            System.out.println("Enter 0 for No, 1 for Yes:");
            answer = input.nextInt();
            
            if(answer == 1) {
                date += GuessDate.getValue(i, 0, 0);
            }
        }
        
        System.out.println("Your DOA is: " + date);
    }
    
}
