class Animal{
    public int age = 40;

    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal{
    public int age = 20;
    public int weight = 10;

    // 静态方法不能被重写
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void play(){
        System.out.println("猫抓老鼠");
    }
}

public class Polymorphic {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        // 成员变量：编译左边 执行左边
        // 成员方法：编译左边 执行右边
        // 因为成员方法可以重写，成员变量没有
        Animal cat = new Cat();

        System.out.println(cat.age);
        // 虽然创建的是猫，但是程序看到的是动物的引用
        // System.out.println(cat.weigth);

        cat.eat();
        // cat.play();
    }
}
