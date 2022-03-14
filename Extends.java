class Fu{
    public Fu(){
        System.out.println("Fu中无参方法被调用");
    }
    public Fu(int age){
        System.out.println("Fu中有参方法被调用");
    }
    public static void show(){
        System.out.println("Fu类的show被调用");
    }
}
class Zi extends Fu{
    public Zi(){
        System.out.println("Zi中无参方法被调用");
    }
    public Zi(int age){
        System.out.println("Zi中有参方法被调用");
    }
    public static void method(){
        System.out.println("method 被调用");
    }
}

public class Extends {
    public static void main(String[] args) {
        Zi z1 = new Zi();
        Zi z2 = new Zi(1);
        z1.show();
        z1.method();
    }
}
