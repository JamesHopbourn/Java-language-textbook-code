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

public class DownCasting {
    public static void main(String[] args) {
        // 向上转型，子类指向父类
        Animal a = new Cat();
        a.eat();
        // 下面这个方法无法访问到
        // a.plat();

        // 向下转型
        Cat c = (Cat) a;
        c.eat();
        c.play();
    }
}
