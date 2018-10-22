/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_9;

import java.io.*;
import java.util.*;
/**
 *
 * @author james.wang
 */
public class Lab9_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        if(args.length != 4) {
            System.out.println("Usage exception!");
            System.exit(0);
        }
        
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist!");
            System.exit(0);
        }
        
        File targetFile = new File(args[1]);
        if(targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exist!");
            System.exit(0);
        }
        
        Scanner input = new Scanner(sourceFile);
        PrintWriter output = new PrintWriter(targetFile);
        
        while(input.hasNext()) {
            String s1 = input.nextLine();
            String s2 = s1.replaceAll(args[2], args[3]);
            output.println(s2);
        }
        
        input.close();
        output.close();
    }
    
}

