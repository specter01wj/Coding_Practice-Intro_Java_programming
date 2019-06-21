import java.util.Scanner;

public class lab4_3 {

    public static void main(String[] args) {
      final int NUM_OF_Q = 5;
      int corrCount = 0, count = 0;
      long startTime = System.currentTimeMillis();
      String output = "";
      Scanner input = new Scanner(System.in);

      while(count < NUM_OF_Q){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        if(num1 < num2){
          int temp = num1;
          num1 = num2;
          num2 = temp;
        }
        System.out.print("Waht is " + num1 + " - " + num2 + "? ");
        int answer = input.nextInt();

        if(num1 - num2 == answer){
          System.out.println("You are correct!");
          corrCount++;
        }
        else{
          System.out.println("Wrong! It should be: " + (num1 - num2));
        }

        count++;

        output += "\n" + num1 + "-" + num2 + "=" + answer +
          ((num1 - num2 == answer) ? "correct!" : "wrong?");

      }

      long endTime = System.currentTimeMillis();
      long testTime = endTime - startTime;

      System.out.println("Correct answer: " + corrCount +
        "\nTest time: " + testTime/1000 + " sec\n" + output);

    }


}
