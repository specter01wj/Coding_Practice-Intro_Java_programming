/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_8;

/**
 *
 * @author james.wang
 */
public class Lab13_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        System.out.println("Num of obj created: " + 
                CircleWithException.getNumOfObj());
        
    }
    
}
