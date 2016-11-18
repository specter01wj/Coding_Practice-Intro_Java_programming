import java.util.Scanner;

public class lab5_10 {

    public static char getRandomChar(char ch1, char ch2) {

      return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLow(){
      return getRandomChar('a', 'z');
    }

    public static char getRandomUpper(){
      return getRandomChar('A', 'Z');
    }

    public static char getRandomDigit(){
      return getRandomChar('0', '9');
    }

    public static char getRandomChar(){
      return getRandomChar('\u0000', '\uFFFF');
    }

}
