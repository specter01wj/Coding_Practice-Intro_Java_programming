import javax.swing.JOptionPane;

public class lab4_15 {

    public static void main(String[] args) {

      int sum = 0;

      int option = JOptionPane.YES_OPTION;

      while(option == JOptionPane.YES_OPTION){
        String dataString = JOptionPane.showInputDialog("Enter int: ");

        int data = Integer.parseInt(dataString);
        sum += data;
        option = JOptionPane.showConfirmDialog(null, "continue?");
      }

      JOptionPane.showMessageDialog(null, "sum is: " + sum);

    }


}
