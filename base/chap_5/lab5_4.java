import java.util.Scanner;

public class lab5_4 {

    public static void main(String[] args) {
      int x = 1;
      System.out.println("x before call: " + x);
      increm(x);
      System.out.println("x after call: " + x);

    }

    public static void increm(int n){

      for(int i = 1; i <= 100; i++){
        n++;
      }
      System.out.println("n inside: " + n);

    }

}
