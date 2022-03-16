interface Jumpping{
    void jump();
}

class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}

class Dog implements Jumpping{
    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }
}
class JumppingOperator{
    public void method(Jumpping j){
        j.jump();
    }
}

public class JumppingDemoObviouslyAndAnonymousClass {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        // 要求传入一个对象 如果对象发生变化 每次都需要创建新类
        Cat cat = new Cat();
        jo.method(cat);

        Dog dog = new Dog();
        jo.method(dog);

        // 所以此处可以使用匿名内部类实现
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("鸡可以跳高了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("鸭可以跳高了");
            }
        });
    }
}