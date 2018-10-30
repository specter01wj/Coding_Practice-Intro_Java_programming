/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_3;

import javax.swing.*;
import java.awt.FlowLayout;
/**
 *
 * @author james.wang
 */
public class Lab12_3 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public Lab12_3() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 25));
        
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(2));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Lab12_3 frame = new Lab12_3();
        
        frame.setTitle("ShowFlowLayout");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    

    
}
