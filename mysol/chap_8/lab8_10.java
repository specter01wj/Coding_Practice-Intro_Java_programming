import java.util.Scanner;

public class lab8_10 {

    public static void main(String[] args) {

      Circle3 myCircle = new Circle3(5.0);

      System.out.println("The area of the cirlce of radius " + myCircle.getRadius() + " is "
                          + myCircle.getArea() );

      myCircle.setRadius(myCircle.getRadius() * 1.1);
      System.out.println("The 2nd area of the cirlce of radius " + myCircle.getRadius() + " is "
                          + myCircle.getArea() );

      System.out.println("The number of objects created is " + Circle3.getNumberOfObjects() );
    }
}
