class Animal{
    private String name;
    private int age;

    public Animal() {}

    public Animal(String name, int age) {
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

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println(this.getName() + "抓老鼠");
    }
}

class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void watchDog(){
        System.out.println("看门狗");
    }
}

public class CatUDog {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(2);
        cat1.setName("加菲猫");
        cat1.catchMouse();

        Cat cat2 = new Cat("折耳猫", 3);
        cat2.catchMouse();
    }
}
