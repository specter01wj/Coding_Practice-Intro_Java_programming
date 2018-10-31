/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_6;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author james.wang
 */
public class Lab12_6 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
    public Lab12_6() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        
        for(int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }
        
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));
        
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTestField("Time to display: "), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        
        add(p2, BorderLayout.EAST);
        add(new JButton("Food to place: "), BorderLayout.CENTER);
    }
    
}
