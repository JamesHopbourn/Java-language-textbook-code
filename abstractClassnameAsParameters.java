abstract class Animal{
    public abstract void eat();
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼肉");
    }
}
class AnimalOperator{
    public void useAnimal(Animal an){
        an.eat();
    }
    public Animal getAnimal(){
        Animal newCat = new Cat();
        return newCat;
    }
}
public class abstractClassnameAsParameters {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        // 多态不能直接实例化 创建子类继承
        Animal cat = new Cat();
        ao.useAnimal(cat);
        Animal ao2 = ao.getAnimal();
        ao2.eat();
    }
}
