import java.util.Scanner;

public class lab4_2 {

    public static void main(String[] args) {
      int num = (int)(Math.random() * 101);
      Scanner input = new Scanner(System.in);

      System.out.print("Guess a number between 0 and 100..... \n");

      int guess = -1;
      while(guess != num){
        System.out.print("Enter your guess: \n");

        guess = input.nextInt();

        if(guess == num){
          System.out.println("Yes, the number is: " + num);
        }
        else if(guess > num){
          System.out.println("Too High! ");
        }
        else{
          System.out.println("Too Low! ");
        }

      }


    }

}
