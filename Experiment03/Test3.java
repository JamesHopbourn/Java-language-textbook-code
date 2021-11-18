import java.util.Scanner;

class Person{
  String name;
  private int age;

  Person(String name){
    this.name = name;
  }

  Person(int age){
    this.age = age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void printInfo(){
    System.out.print(this.name + ',' + this.age);
  }
}

public class Test3{
  public static void main(String[] args) {
  System.out.println("胡金栋 202012900312 软工203");
  Scanner sc = new Scanner(System.in);

  System.out.print("请输入名字：");
  String name = sc.next();

  System.out.print("请输入年龄：");
  int age = sc.nextInt();

  Person person = new Person(name);
  person.setAge(age);
  person.printInfo();
  }
}