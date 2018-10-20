/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_7;

/**
 *
 * @author james.wang
 */
public class Lab9_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        java.io.File file = new java.io.File("m2.txt");
        if(file.exists()) {
            System.out.println("File already exists!");
            System.exit(0);
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        output.print("James Wang ");
        output.println(9000);
        output.close();
    }
    
}




