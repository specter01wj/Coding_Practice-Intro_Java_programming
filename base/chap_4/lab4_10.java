import java.util.Scanner;

public class lab4_10 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of dots: ");
      int numTry = input.nextInt();
      int numHit = 0;

      for(int i = 0; i < numTry; i++){
        double x = Math.random() * 2.0 - 1;
        double y = Math.random() * 2.0 - 1;
        if(x * x + y * y <= 1){
          numHit++;
        }
      }

      double pi = 4.0 * numHit / numTry;
      System.out.println("PI is:" + pi);

    }


}
