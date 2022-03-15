class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void play(){
        System.out.println("猫抓老鼠");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗看门");
    }
}

class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("猪吃菜");
    }
}

// 动物操作类
class AnimalOperator{
    public void useAnimal(Animal a){
        a.eat();
        // a.play();
    }
}

public class PolymorphicAnimal.java {
    public static void main(String[] args) {
        AnimalOperator an = new AnimalOperator();
        Cat cat = new Cat();
        an.useAnimal(cat);

        Dog dog = new Dog();
        an.useAnimal(dog);

        Pig pig = new Pig();
        an.useAnimal(pig);
    }
}

/* result
猫吃鱼
狗看门
猪吃菜
 */
