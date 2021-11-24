class Circle implements Shape
{
  doubel PI = 3.14;
  double radius;
  public void Circle(double radius)
  {
    this.radius = radius;
  }
  public double getArea()
  {
    return PI * radius * radius;
  }
  public void printInfo()
  {
    System.out.print(getArea());
  }
}

public class Cat
{
  public static void main(String[] args) 
  {
      Circle c = new Circle(5);
      c.printInfo();
  }
}