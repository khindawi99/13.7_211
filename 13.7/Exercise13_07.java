package ch_13.excerise13_07;
import java.util.Random;


public class Exercise13_07 {

    static Random randomDbl = new Random();

    public static void main(String[] args) {
      Geometricobject[] test = new Geometricobject[5];
      for (int i = 0; i < test.length; i++) {
        test[i] = new Square(randomDbl.nextDouble() * 9);

      }
      for (Object object : test) {
        if (object instanceof Square) {
          Square square = (Square) object;
          System.out.println("Area = " + square.getArea() + " squared");
          System.out.println("How to color method result: ");
          square.howToColor();
        }
      }


    }
}
