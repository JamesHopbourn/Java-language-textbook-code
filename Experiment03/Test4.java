import java.util.Scanner;

abstract class Shape{
  String name;
  double side;
  double perimeter;
  double PI = 3.14;
  public double getPerimeter(){
    return this.perimeter; 
  }
}

class Triangle extends Shape{
  Triangle(String Shape, double side){
    this.name = Shape;
    this.perimeter = side * 3;
  }
}

class Circle extends Shape{
  Circle(String Shape, double radius){
    this.name = Shape;
    this.perimeter = 2 * PI * radius;
  }
}

class MoonCakeFactory{
  public void produceMoonCake(Shape Shape){
    System.out.println("制作了一个" + Shape.name + "，面积为" + Shape.getPerimeter());
  }
}

public class Test4{
  public static void main(String[] args) {
    System.out.println("胡金栋 202012900312 软工203");
    Scanner sc = new Scanner(System.in);

    System.out.print("请输入等边三角形的边：");
    double side = sc.nextDouble();

    System.out.print("请输入圆的半径：");
    double radius = sc.nextDouble();

    Triangle triangle = new Triangle("等边三角形", side);
    System.out.println("三角形的周长为：" + triangle.getPerimeter());

    Circle circle = new Circle("圆", radius);
    System.out.println("圆周长为：" + circle.getPerimeter());

    // 实例化月饼制作工厂
    MoonCakeFactory factory = new MoonCakeFactory();

    // 制作圆形月饼
    factory.produceMoonCake(circle);

    // // 制作三角形月饼
    factory.produceMoonCake(triangle);
  }
}