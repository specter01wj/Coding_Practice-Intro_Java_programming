/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_7;

import java.io.*;

/**
 *
 * @author james.wang
 */

// TestObjectStreamForArray
public class Lab17_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO code application logic here
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};
        
        try (
            ObjectOutputStream output = new ObjectOutputStream(new 
              FileOutputStream("array.dat", true));
        ) {
            output.writeObject(numbers);
            output.writeObject(strings);








            
        }
        
        try (
            ObjectInputStream input =
              new ObjectInputStream(new FileInputStream("array.dat"));
        ) {
            int[] newNumbers = (int[])(input.readObject());
            String[] newStrings = (String[])(input.readObject());
            
            for (int i = 0; i < newNumbers.length; i++) {
              System.out.print(newNumbers[i] + " ");
            }
            
            System.out.println();

            for (int i = 0; i < newStrings.length; i++) {
              System.out.print(newStrings[i] + " ");
            }
          }
    }
    
}
