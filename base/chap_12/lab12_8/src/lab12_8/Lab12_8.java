/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12_8;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author james.wang
 */
public class Lab12_8 extends JFrame {
    
    private ImageIcon usIcon = new ImageIcon("image/us.gif");
    private ImageIcon myIcon = new ImageIcon("image/my.gif");
    private ImageIcon frIcon = new ImageIcon("image/fr.gif");
    private ImageIcon ukIcon = new ImageIcon("image/uk.gif");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public Lab12_8() {
        setLayout(new GridLayout(1, 4, 5, 5));
        add(new JLabel(usIcon));
        add(new JLabel(myIcon));
        add(new JLabel(frIcon));
        add(new JLabel(ukIcon));
    }
    
}
