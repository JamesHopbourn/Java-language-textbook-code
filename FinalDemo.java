class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// final class Father{
class Father{
    // public static void show(){
    public static void show(){
        System.out.println("父类方法");
    }
}

class Son extends Father {
    final int age = 30;
    public static void show(){
        int age = 20;
        System.out.println(age);
        System.out.println("子类方法");
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();

        // final 修改基本类型变量
        final int year = 2022;
        // year = 2021;
        System.out.println(year);

        // final 修饰引用类型变量
        final Student student = new Student("JamesHopbourn", 22);
        // final 保证 student 地址不变 但是地址所对应的内容可变
        student.setAge(100);
        System.out.println(student.getName() + student.getAge());
    }
}
