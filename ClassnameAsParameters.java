class Cat {
    public void eat() {
        System.out.println("猫吃鱼肉");
    }
}

class CatOperator{
    // 类名作为形参
    public void useCat(Cat cat){
        cat.eat();
    }
    // 参数名作为返回值
    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}

public class ClassnameAsParameters {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();
        c2.eat();
    }
}
