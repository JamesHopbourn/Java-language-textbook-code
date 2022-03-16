interface Inter{
    void show();
}

class Outter {
    public void method(){
        // 把对象返回给 Inter 对象
        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        for (int j = 0; j < 5; j++){
            i.show();
        }
        // 本质是一个对象，可以调用方法
    }
}

class anonymousInnerClass {
    public static void main(String[] args) {
        Outter ou = new Outter();
        ou.method();
    }
}