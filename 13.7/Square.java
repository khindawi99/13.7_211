package ch_13.excerise13_07;

public class Square  extends Geometricobject {  private double height;

  public Square(double height) {
    this.height = height;
  }

  @Override
  public void howToColor() {
    System.out.println("Color all four sides.");

  }

  @Override
  public double getArea() {
    return height * height;
  }

  @Override
  public double getPerimeter() {
    return height * 4;
  }
}
