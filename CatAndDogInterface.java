interface Jumpping{
    void jump();
}

class Dog implements Jumpping{
    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }
}

class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}

public class CatAndDogInterface {
    public static void main(String[] args) {
        Jumpping cat = new Cat();
        cat.jump();
        Jumpping dog = new Dog();
        dog.jump();
    }
}
