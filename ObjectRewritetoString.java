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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ObjectRewritetoString {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("James Hopbourn");
        student.setAge(22);
        System.out.println(student); // Student@36baf30c
        System.out.println(student.toString());

        /* 重写 toString() 之后
        Student{name='James Hopbourn', age=22}
        Student{name='James Hopbourn', age=22}
         */

        /*public void println(Object x) { // x == student
                String s = String.valueOf(x);
                if (getClass() == PrintStream.class) {
                    // need to apply String.valueOf again since first invocation
                    // might return null
                    writeln(String.valueOf(s));
                } else {
                    synchronized (this) {
                        print(s);
                        newLine();
                    }
                }
            }

            public static String valueOf(Object obj) { obj == x == student
                return (obj == null) ? "null" : obj.toString();
            }

            public String toString() {
                // Student@36baf30c
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
         */
    }
}
