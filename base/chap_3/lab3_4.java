import java.util.Scanner;

public class lab3_4 {

    public static void main(String[] args) {

      int num1 = (int)(Math.random() * 10);
      int num2 = (int)(Math.random() * 10);

      if(num1 < num2){
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
      }

      System.out.print("what is " + num1 + " - " + num2 + "?\n");
      Scanner input = new Scanner(System.in);

      int answer = input.nextInt();

      if(num1 - num2 == answer){
        System.out.print("Correct!\n");
      }
      else{
        System.out.print("Wrong! \nIt should be \" " + (num1 - num2) +" \"\n");
      }

    }

}
