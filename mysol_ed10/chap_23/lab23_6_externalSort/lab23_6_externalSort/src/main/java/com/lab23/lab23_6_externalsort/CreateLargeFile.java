/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab23.lab23_6_externalsort;
import java.util.*;
import java.io.*;

/**
 *
 * @author jinwang
 */
public class CreateLargeFile {
    
    public static void main(String[] args) throws Exception {
        DataOutputStream output = new DataOutputStream(
          new BufferedOutputStream(
          new FileOutputStream("largedata.dat")));

        for (int i = 0; i < 800004; i++)
          output.writeInt((int)(Math.random() * 1000000));

        output.close();

        // Display first 100 numbers
        DataInputStream input = 
          new DataInputStream(new FileInputStream("largedata.dat"));
        for (int i = 0; i < 100; i++)
          System.out.print(input.readInt() + " ");

        input.close();
    }
    
}
