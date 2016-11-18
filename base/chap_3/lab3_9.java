import java.util.Scanner;

public class lab3_9 {

    public static void main(String[] args) {
      int lottery = (int)(Math.random() * 100);

      Scanner input = new Scanner(System.in);
      System.out.print("Enter your lottery number(2 digits): ");
      int guess = input.nextInt();

      int lotDig1 = lottery / 10;
      int lotDig2 = lottery % 10;

      int guessDig1 = guess / 10;
      int guessDig2 = guess % 10;

      System.out.println("the lottery number is: " + lottery);

      if(guess ==  lottery){
        System.out.print("Exact match: you win $10,000!!!\n");
      }
      else if(guessDig2 == lotDig1 && guessDig1 == lotDig2){
        System.out.print("all digits match: you win $3,000!!\n");
      }
      else if(guessDig1 == lotDig1 || guessDig1 == lotDig2 ||
        guessDig2 == lotDig1 || guessDig2 == lotDig2){
        System.out.print("one match: you win $1,000!!\n");
      }
      else{
        System.out.print("Sorry, no match....\n");
      }

    }

}
