class Student {
    public String name;
    public int age;
    public static String university;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 非静态方法可以访问任意成员与方法
    public void dynamicShow(){
        System.out.println(name + ", " + age + ", " + university);
    }
    // 静态方法只能访问静态成员与方法
    public static void staticShow(){
        // 无法访问 name 和 age
        // System.out.println(name + ", " + age + ", " + university);
    }
}

public class publicStatic {
    public static void main(String[] args) {
        Student.university = "PTU";

        Student student1 = new Student("小明" , 22);
        student1.dynamicShow();

        Student student2 = new Student("小红", 21);
        student2.dynamicShow();
    }
}

/* result
小明, 22, PTU
小红, 21, PTU
*/