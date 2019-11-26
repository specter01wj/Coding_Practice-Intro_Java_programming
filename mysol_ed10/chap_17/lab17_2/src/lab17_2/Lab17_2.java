/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_2;

import java.io.*;

/**
 *
 * @author james.wang
 */

// TestDataStream
public class Lab17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));) {
            output.writeUTF("James");
            output.writeDouble(95.5);
            output.writeUTF("Kim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }
        
        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
    
}
