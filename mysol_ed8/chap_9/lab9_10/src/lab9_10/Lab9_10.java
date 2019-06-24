/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_10;

import java.util.Scanner;
import javax.swing.JFileChooser;
/**
 *
 * @author james.wang
 */
public class Lab9_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        JFileChooser fileChooser = new JFileChooser();
        
        if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            java.io.File file = fileChooser.getSelectedFile();
            Scanner input = new Scanner(file);
            while(input.hasNext()) {
                System.out.println(input.nextLine());
            }
            input.close();
        } else {
            System.out.println("No file selected!");
        }
        
    }
    
}
