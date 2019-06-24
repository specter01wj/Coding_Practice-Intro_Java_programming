/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_5;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author james.wang
 */
public class Lab13_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name: ");
        String filename = input.nextLine();
        
        try {
            Scanner inputFile = new Scanner(new File(filename));
            System.out.println("File " + filename + " exists....");
        } 
        catch(FileNotFoundException ex) {
            System.out.println("Exception: " + filename + " not found!!!");
        }
        
    }
    
}
