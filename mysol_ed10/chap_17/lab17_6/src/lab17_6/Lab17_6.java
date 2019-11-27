/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_6;

import java.io.*;

/**
 *
 * @author james.wang
 */

// TestObjectInputStream
public class Lab17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO code application logic here
        try ( // Create an input stream for file object.dat
      ObjectInputStream input =
        new ObjectInputStream(new FileInputStream("object.dat"));
    ) {
      // Read a string, double value, and object from the file
      String name = input.readUTF();
      double score = input.readDouble();
      java.util.Date date = (java.util.Date)(input.readObject());
      System.out.println(name + " " + score + " " + date);
    }
    }
    
}
