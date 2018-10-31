/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_7;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author james.wang
 */
public class Lab12_7 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Lab12_7();
        frame.setTitle("TestSwingCommonFeatures");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public Lab12_7() {
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
        JButton jbtLeft = new JButton("Left");
        JButton jbtCenter = new JButton("Center");
        JButton jbtRight = new JButton("Right");
        jbtLeft.setBackground(Color.WHITE);
        jbtCenter.setForeground(Color.GREEN);
        jbtRight.setToolTipText("Right button!");
        p1.add(jbtLeft);
        p1.add(jbtCenter);
        p1.add(jbtRight);
        p1.setBorder(new TitledBorder("3 Buttons"));
        
        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);
        
        JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
        JLabel jlblRed = new JLabel("Red");
        JLabel jlblOrange = new JLabel("Orange");
        jlblRed.setForeground(Color.red);
        jlblOrange.setForeground(Color.orange);
        jlblRed.setFont(largeFont);
        jlblOrange.setFont(largeFont);
        jlblRed.setBorder(lineBorder);
        jlblOrange.setBorder(lineBorder);
        p2.add(jlblRed);
        p2.add(jlblOrange);
        p2.setBorder(new TitledBorder("2 Labels"));
        
        setLayout(new GridLayout(2, 1, 5, 5));
        add(p1);add(p2);
    }
    
}
