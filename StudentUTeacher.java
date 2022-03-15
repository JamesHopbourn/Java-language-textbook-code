package com.stu;

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
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

class Teacher extends People {
    // 一旦本类里有了带参构造方法，系统给的无参构造方法会被覆盖
    // 所以需要在这里手动定义一个无参构造方法
    public Teacher() {
    }

    // 父类没有 Teacher 带参构造方法，需要在 Teacher 里实现
    public Teacher(String name, int age) {
        // 通过 super 把参数传给父类
        // 用父类自己的方法设置私有变量
        super(name, age);
    }

    public static void teach() {
        System.out.println("教书育人");
    }
}

class Student extends People {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public static void study() {
        System.out.println("好好学习");
    }
}

public class StudentUTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(30);
        t1.setName("第一位老师");
        System.out.println(t1.getName() + " " + t1.getAge() + "岁");
        t1.teach();

        Teacher t2 = new Teacher("第二位老师", 20);
        System.out.println(t2.getName() + " " + t2.getAge() + "岁");
        t2.teach();

        Student s1 = new Student();
        s1.setAge(22);
        s1.setName("第一位学生");
        System.out.println(s1.getName() + " " + s1.getAge() + "岁");
        s1.study();

        Student s2 = new Student("第二位学生", 20);
        System.out.println(s2.getName() + " " + s2.getAge() + "岁");
        s2.study();
    }
}
