/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_6;

/**
 *
 * @author james.wang
 */
public class Lab9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.io.File file = new java.io.File("image/us.gif");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("Len: " + file.length() + " bytes; " + "Can read: " + file.canRead()
            + "; Can write: " + file.canWrite() + "; isDirect: " + file.isDirectory() 
            + "; isFile: " + file.isFile() + "; isAbs: " + file.isAbsolute() 
            + "; isHidden: " + file.isHidden() + "; absol path: " + file.getAbsolutePath());
        System.out.println("Last modified: " + new java.util.Date(file.lastModified()));
    }
    
}
