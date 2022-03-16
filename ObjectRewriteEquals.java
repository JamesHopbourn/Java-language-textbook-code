class Student extends Object{
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

    @Override
    public boolean equals(Object o) {
        /*
        this - student1
        o - student2
         */
        // 比较地址是否相同
        if (this == o) return true;
        // 判断是否为 null，判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
        // 向下转型 student2
        Student student = (Student) o;
        // 两个单独取出比较
        return this.age == student.age && Objects.equals(name, student.name);
    }
}

public class ObjectRewriteEquals {
    public static void main(String[] args) {
        Student student1 = new Student("James Hopbourn", 22);
        Student student2 = new Student("James Hopbourn", 22);

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        /*
          public boolean equals(Object obj) {

                this = student1
                obj = student2
                return (this == obj);
            }
         */
    }
}
