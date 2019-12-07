/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18_8_towerofhanoi;

import java.util.Scanner;

/**
 *
 * @author james.wang
 */

// TowerOfHanoi
public class Lab18_8_towerOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();
        
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');
    }
    
}
