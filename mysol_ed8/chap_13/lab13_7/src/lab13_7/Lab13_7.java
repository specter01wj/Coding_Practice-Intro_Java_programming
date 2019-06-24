/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13_7;

/**
 *
 * @author james.wang
 */
public class Lab13_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println(sum(new int[] {1,2,3,4,5}));
        }
        catch(Exception ex) {
            ex.printStackTrace();
            System.out.println("\nex.get:" + ex.getMessage());
            System.out.println("\nex/toS:" + ex.toString());
            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            
            for(int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }
    
    private static int sum(int[] list) {
        int result = 0;
        for(int i = 0; i <= list.length; i++) {
            result += list[i];
        }
        return result;
    }
    
}


