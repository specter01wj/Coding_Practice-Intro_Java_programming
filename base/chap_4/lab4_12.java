import java.util.Scanner;

public class lab4_12 {

    public static void main(String[] args) {
      int sum = 0, num = 0;

      while(num < 20){
        num++;

        if(num == 10 || num == 11)
          continue;

        sum += num;
      }

      System.out.println("number is:" + num);
      System.out.println("sum is:" + sum);

    }


}
