interface Shape{
  double getArea();
  void info();
}

class Circle implements Shape{
  double PI = 3.14;
  double radius;
  public Circle(double radius){
    this.radius = radius;
  }
  public double getArea(){
    return PI * radius * radius;
  }
  public void info(){
    System.out.print(getArea());
  }
}

public class Example_0312{
  public static void main(String[] args) {
    Circle c = new Circle(5);
    c.info();
  }
}