/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_5;

import java.io.*;

/**
 *
 * @author james.wang
 */

// TestObjectOutputStream
public class Lab17_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try (
            ObjectOutputStream output =
              new ObjectOutputStream(new FileOutputStream("object.dat"));
        ) {
            output.writeUTF("James");
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());
        }
    }
    
}
