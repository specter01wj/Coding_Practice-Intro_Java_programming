import java.util.Scanner;
import javax.swing.*;

public class lab8_6 {

  public static void main(String[] args) {

    JButton jbtOK = new JButton("OK");
    JButton jbtCancel = new JButton("Cancel");
    JLabel jlblName = new JLabel("Enter your name: ");
    JTextField jtfName = new JTextField("Type name here: ");
    JCheckBox jchkBold = new JCheckBox("Bold");
    JCheckBox jchkItalic = new JCheckBox("Italic");
    JRadioButton jrbRed = new JRadioButton("Red");
    JRadioButton jrbYellow = new JRadioButton("Yellow");

    JComboBox jcboColor = new JComboBox(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});

    JPanel panel = new JPanel();
    panel.add(jbtOK);
    panel.add(jbtCancel);
    panel.add(jlblName);
    panel.add(jtfName);
    panel.add(jchkBold);
    panel.add(jchkItalic);
    panel.add(jrbRed);
    panel.add(jrbYellow);
    panel.add(jcboColor);

    JFrame frame = new JFrame();
    frame.add(panel);
    frame.setTitle("Show GUI Comp");
    frame.setSize(400, 350);
    frame.setLocation(410, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}
