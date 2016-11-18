import java.util.Scanner;

public class lab4_11 {

    public static void main(String[] args) {
      int sum = 0, num = 0;

      while(num < 20){
        num++;
        sum += num;
        if(sum >= 100)
          break;
      }

      System.out.println("number is:" + num);
      System.out.println("sum is:" + sum);

    }


}
