class Person {
  float height;
  char sex;
  boolean married;
  Person(float h, char s, boolean m) {
    height = h;
    sex = s;
    married = m;
  }
}

public class E303 {
  public static void main(String args[]) {
    Person m = new Person(1.75f, 'W', true);
    System.out.println("m.height = " + m.height);
    System.out.println("m.sex = " + m.sex);
    System.out.println("m.married = " + m.married);
  }
}
