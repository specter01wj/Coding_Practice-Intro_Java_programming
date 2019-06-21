import java.util.Scanner;

public class lab5_2 {

    public static void main(String[] args) {
      System.out.print("Grade A is: ");
      getGrade(85.5);
      System.out.print("Grade B is: ");
      getGrade(90);

    }

    public static void getGrade(double score){

      if(score >= 95){
        System.out.println("A+!");
      }
      else if(score >= 90){
        System.out.println("A.");
      }
      else if(score >= 85){
        System.out.println("B+..");
      }
      else if(score >= 80){
        System.out.println("B...");
      }
      else if(score >= 75){
        System.out.println("B-...");
      }
      else if(score >= 70){
        System.out.println("C+?");
      }
      else if(score >= 60){
        System.out.println("D??");
      }
      else{
        System.out.println("F???");
      }

    }

}
