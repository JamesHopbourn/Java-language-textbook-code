class Outter {
    private int a = 10;

    class Innner {
        public void show() {
            // 内部类可以直接访问外部类
            // 包括 private 类型变量
            System.out.println(a);
        }
    }
    // 外部类要访问内部类 需要先创建对象
    public void show1() {
        Innner o = new Innner();
        o.show();
    }
}

class OuterAndInner {
    public static void main(String[] args) {
        Outter o = new Outter();
        o.show1();
    }
}