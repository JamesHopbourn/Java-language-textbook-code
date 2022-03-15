class Outter {
    private int num = 10;
    public class Innner {
        public void show() {
            // 内部类可以直接访问外部类
            // 包括 private 类型变量
            System.out.println(num);
        }
    }
}

class accessPublicInnerNumber {
    public static void main(String[] args) {
        Outter.Innner oi = new Outter().new Innner();
        oi.show();
    }
}