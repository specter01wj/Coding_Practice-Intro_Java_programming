/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17_4_copyfiles;

import java.io.*;

/**
 *
 * @author james.wang
 */

// Copy
public class Lab17_4_copyFiles {

    /**
     * @param args[0] for sourcefile 
     * @param args[1] for target file
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 2) { 
            System.out.println(
              "Usage: java Copy sourceFile targetfile");
            System.exit(1);
        }
    }
    
}
