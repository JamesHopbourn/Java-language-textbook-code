class Person {
  String name;
  private int age;

  Person(String name) {
    this.name = name;
  }

  Person(String name, int age){
    this.age = age;
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void printInfo() {
    System.out.print(this.name + ',' + this.age);
  }
}
