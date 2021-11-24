import java.util.Scanner;

public class Test3 {
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