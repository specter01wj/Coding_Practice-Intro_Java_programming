/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_11;

/**
 *
 * @author jinwang
 */
public class Lab13_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void method1() throws Exception {
        try {
            method2();
        }
        catch(Exception ex) {
            throw new Exception("New info from method1!", ex);
        }
    }
    
    public static void method2() throws Exception {
        throw new Exception("New info from method2!");
    }
    
}
