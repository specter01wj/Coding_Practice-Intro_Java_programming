/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14_8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
/**
 *
 * @author james.wang
 */
public class Lab14_8 extends JFrame {

    public Lab14_8() {
        
        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");
        
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jbtCancel);
        
        add(panel);
        
        OKListenerClass listener1 = new OKListenerClass();
        CanelListenerClass listener2 = new CanelListenerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Lab14_8();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}

class OKListenerClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked!");
    }
}

class CanelListenerClass implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Canel button clicked!");
    }
}
