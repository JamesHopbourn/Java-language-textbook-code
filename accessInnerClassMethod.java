class Outter {
    private int num = 10;
    public void InnerMethod(){
        int num2 = 20;
        class Inner{
            // 局部方法的内部类 → 局部内部类
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }
        // 在方法中定义的类 外界无法直接使用
        // 需要在方法内部创建对象并使用
        // 可以直接访问外部类成员
        // 也可以访问方法内的变量
        Inner i = new Inner();
        i.show();
    }
}

class accessInnerClassMethod {
    public static void main(String[] args) {
        Outter ou = new Outter();
        ou.InnerMethod();
    }
}