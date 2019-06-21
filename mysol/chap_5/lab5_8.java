import java.util.Scanner;

public class lab5_8 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a dec number: ");
      int decimal = input.nextInt();

      System.out.println("The HEX number is: " + decToHex(decimal));
    }

    public static String decToHex(int decimal){
      String hex = "";

      while(decimal != 0){
        int hexVal = decimal % 16;
        hex = toHexChar(hexVal) + hex;
        decimal = decimal / 16;
      }
      return hex;
    }

    public static char toHexChar(int hexVal){
      if(hexVal <= 9 && hexVal >= 0){
        return (char)(hexVal + '0');
      }
      else{
        return (char)(hexVal - 10 + 'A');
      }
    }


}
