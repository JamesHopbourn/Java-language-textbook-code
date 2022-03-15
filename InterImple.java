interface Jumpping{
    void jump();
}

abstract class Animal{
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

    public abstract void eat();
}

class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }
}

class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼肉");
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}

public class InterImple {
    public static void main(String[] args) {
        Jumpping cat = new Cat();
        cat.jump();

        System.out.println();

        Animal cat2 = new Cat();
        cat2.setAge(2);
        cat2.setName("加菲猫");
        cat2.eat();
        ((Cat) cat2).jump();

        System.out.println();

        Cat cat3 = new Cat("折耳猫", 3);
        System.out.println(cat3.name + cat3.age);
        cat3.eat();
        cat3.jump();

        System.out.println();

        Jumpping dog = new Dog();
        dog.jump();
    }
}
