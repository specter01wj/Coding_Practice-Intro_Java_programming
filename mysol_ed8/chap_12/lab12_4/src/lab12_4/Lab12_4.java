/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_4;

import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author james.wang
 */
public class Lab12_4 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lab12_4 frame = new Lab12_4();
        
        frame.setTitle("ShowFlowLayout");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public Lab12_4() {
        setLayout(new GridLayout(3, 2, 10, 10));
        
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("MI"));
        add(new JTextField(2));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    
}
