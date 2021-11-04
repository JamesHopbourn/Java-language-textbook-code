import static hopbourn.common.*;

public class Human {
  public static void main(String[] args) {
    // 静态变量直接引用
    println(Person.count);
    // 2. 创建实例
    Person woman = new Person('M', false);
    // 3. 输出结果
    println(woman.sex);
    println(woman.married);
    // 4. 方法重载
    Person man = new Person('M', 1.75f, true);
    println(man.sex);
    println(man.height);
    println(man.married);
    // 静态变量直接引用
    println(Person.count);
  }
}

// 1. 描述对象
class Person {
  char sex;
  float height;
  boolean married;
  static int count = 0;
  Person(char sex, boolean married) {
    count++;
    this.sex = sex;
    this.married = married;
  }
  Person(char sex, float height, boolean married) {
    count++;
    this.sex = sex;
    this.height = height;
    this.married = married;
  }
}
