/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_3;

import java.io.*;

/**
 *
 * @author james.wang
 */

// DetectEndOfFile
public class Lab17_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            try (DataOutputStream output = 
              new DataOutputStream(new FileOutputStream("test.dat"))) {
              output.writeDouble(4.5);
              output.writeDouble(43.25);
              output.writeDouble(3.2);
            }

            try (DataInputStream input = 
              new DataInputStream(new FileInputStream("test.dat"))) {
              while (true) {
                System.out.println(input.readDouble());
              }
            }
        }
        catch (EOFException ex) {
            System.out.println("All data were read");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
