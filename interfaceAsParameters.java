interface Jumpping{
    void jump();
}

class JumppingOperator{
    public void useJumpping(Jumpping j){
        j.jump();
    }

    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }
}

// 接口不能直接实例化 创建猫类实现接口 重写方法
class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}

public class interfaceAsParameters {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping cat = new Cat();
        jo.useJumpping(cat);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
