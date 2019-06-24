/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_10;

import java.io.*;
/**
 *
 * @author james.wang
 */
public class Lab13_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.io.PrintWriter output = null;
        
        try {
            output = new java.io.PrintWriter("text.txt");
            output.println("James Wang!!! hello");
        }
        catch(java.io.IOException ex) {
            ex.printStackTrace();
        }
        finally {
            if(output != null) output.close();
        }
        
        System.out.println("End of Program....");
        
    }
    
}
