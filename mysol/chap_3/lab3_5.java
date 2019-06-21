import java.util.Scanner;

public class lab3_5 {

    public static void main(String[] args) {
      final double kiloPerPound = 0.453;
      final double meterPerInch = 0.0254;

      Scanner input = new Scanner(System.in);

      System.out.print("Enter weight: ");
      double weight = input.nextDouble();

      System.out.print("Enter height: ");
      double height = input.nextDouble();

      double weightKilo = weight * kiloPerPound;
      double heightMeter = height * meterPerInch;
      double bmi = weightKilo / (heightMeter * heightMeter);

      System.out.print("Your BMI: " + bmi + "\n");
      if(bmi < 16)
        System.out.print("die fool!\n");
      else if(bmi < 18)
        System.out.print("underweight\n");
      else if(bmi < 24)
        System.out.print("normal!!\n");
      else if(bmi < 29)
        System.out.print("overweight\n");
      else if(bmi < 35)
        System.out.print("badly underweight!!!\n");
      else
        System.out.print("hi! superman?!\n");
    }

}
