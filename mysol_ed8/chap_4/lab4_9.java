import java.util.Scanner;

public class lab4_9 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your tuition: ");
      double tuition = input.nextDouble();

      int year = 1;
      double tuComp = tuition * 2;

      while(tuition < tuComp){
        tuition = tuition * 1.07;
        year++;
      }

      System.out.println("Tution will be doubled:" + year + " years");

    }


}
