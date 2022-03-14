import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private String name;
    private String age;
    private String studentID;
    private String address;

    public Student(String name, String age, String studentID, String address) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }
}

class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 更新学生");
            System.out.println("4. 查看所有学生");
            System.out.println("5. 退出系统");
            System.out.print("请输入你的选择：");

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> addStudent(array);
                case 2 -> deleteStudent(array);
                case 3 -> updateStudent(array);
                case 4 -> showStudent(array);
                case 5 -> {
                    System.out.println("谢谢使用");
                    System.exit(0);
                }
                default -> System.out.println("输入错误请重新输入");
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String studentID;
        while (true) {
            System.out.print("学生学号：");
            studentID = sc.nextLine();
            if (isIDExistCheck(array, studentID)) {
                System.out.println("该学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.print("学生名字：");
        String name = sc.nextLine();
        System.out.print("学生年龄：");
        String age = sc.nextLine();
        System.out.print("学生地址：");
        String address = sc.nextLine();
        Student student = new Student(name, age, studentID, address);
        if (array.add(student)) {
            System.out.println("添加学生信息成功");
        } else {
            System.out.println("添加学生信息失败");
        }
    }

    public static void showStudent(ArrayList<Student> array) {
        if (isArrayEmptyCheck(array)) return;
        System.out.println("学号\t\t\t名字\t\t年龄\t\t居住地");
        for (Student student : array) {
            System.out.println(student.getStudentID() + "\t\t\t" + student.getName() + "\t\t" + student.getAge() + "岁\t\t" + student.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        if (isArrayEmptyCheck(array)) return;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号：");
        String studentID = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getStudentID().equals(studentID)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("学号不存在，请重新输入");
            deleteStudent(array);
        } else {
            array.remove(index);
            System.out.println("删除学生信息成功");
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        if (isArrayEmptyCheck(array)) return;
        Scanner sc = new Scanner(System.in);
        String studentID;
        while (true) {
            System.out.print("请输入要修改的学生学号：");
            studentID = sc.nextLine();
            if (isIDExistCheck(array, studentID)) {
                break;
            } else {
                System.out.println("该学号不存在，请重新输入");
            }
        }
        System.out.print("请输入学生新名字：");
        String name = sc.nextLine();
        System.out.print("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.print("请输入学生新地址：");
        String address = sc.nextLine();
        Student newStudent = new Student(name, age, studentID, address);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getStudentID().equals(studentID)) {
                array.set(i, newStudent);
                break;
            }
        }
        System.out.println("修改学生信息成功");
    }

    public static boolean isIDExistCheck(ArrayList<Student> array, String studentID) {
        for (Student student : array) {
            if (student.getStudentID().equals(studentID)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArrayEmptyCheck(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂无学生信息，请先添加学生信息");
            return true;
        }
        return false;
    }
}
