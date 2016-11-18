import java.util.Scanner;

public class lab5_3 {

    public static void main(String[] args) {
      System.out.println("Grade A is: " + getGrade(85.5));

      System.out.println("Grade B is: " + getGrade(90));


    }

    public static String getGrade(double score){

      if(score >= 95){
        return "A+!";
      }
      else if(score >= 90){
        return "A.";
      }
      else if(score >= 85){
        return "B+..";
      }
      else if(score >= 80){
        return "B...";
      }
      else if(score >= 75){
        return "B-...";
      }
      else if(score >= 70){
        return "C+?";
      }
      else if(score >= 60){
        return "D??";
      }
      else{
        return "F???";
      }

    }

}
