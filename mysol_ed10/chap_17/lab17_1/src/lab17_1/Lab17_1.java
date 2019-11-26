/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_1;

import java.io.*;

/**
 *
 * @author james.wang
 */

// TestFileStream
public class Lab17_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try (FileOutputStream output = new FileOutputStream("temp.dat");) {
            for(int i = 1; i <= 10; i++) {
                output.write(i);
            }
        }
        
        try (FileInputStream input = new FileInputStream("temp.dat");) {
            int value;
            while((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        }
    }
    
}
