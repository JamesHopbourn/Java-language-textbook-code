class Animal{
    public String name;
    public int age;

    public Animal() {
    }

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

    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void play(){
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

public class PolymorphicCat {
    public static void main(String[] args) {
        // 多态创建对象
        Animal cat = new Cat("加菲猫" , 5);
        System.out.println(cat.getName() + " " + cat.getAge() + "岁");
    }
}
