import javax.swing.JOptionPane;

public class lab2_11 {

    public static void main(String[] args) {

      String annulInterestRateString = JOptionPane.showInputDialog("enter yearly interest rate: ");

      double annualInt = Double.parseDouble(annulInterestRateString);
      double monthlyInt = annualInt / 1200;

      String numOfYearString = JOptionPane.showInputDialog("enter number of years: ");

      int numYear = Integer.parseInt(numOfYearString);

      String loanString = JOptionPane.showInputDialog("enter loan amount: ");

      double loanAmount = Double.parseDouble(loanString);

      double monthlyPay = loanAmount * monthlyInt / (1 - 1 / Math.pow(1 + monthlyInt, numYear * 12));
      double totalPay = monthlyPay * numYear * 12;

      monthlyPay = (int)(monthlyPay * 100) / 100.0;
      totalPay = (int)(totalPay * 100) / 100.0;

      String output = "monthly payment is " + monthlyPay + "\nTotal payment is " + totalPay;

      JOptionPane.showMessageDialog(null, output);

    }

}
