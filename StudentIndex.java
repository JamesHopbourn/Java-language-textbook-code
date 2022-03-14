import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String age;

    // 无参数构造方法
    public Student() {
    }

    // 构造方法 初始化的时候使用
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

class Untitled {

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (Student s : array) {
            System.out.println(s.getName() + " " + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入名字：");
        String name = sc.nextLine();
        System.out.print("请输入年龄：");
        String age = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);
    }
}