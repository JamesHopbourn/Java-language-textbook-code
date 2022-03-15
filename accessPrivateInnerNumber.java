class Outter {
    private int num = 10;
    private class Innner {
        public void show() {
            System.out.println(num);
        }
    }
    // Inner 被 private 保护
    // 需要在 Outer 创建方法实现内部访问
    public void showInner(){
        Innner in = new Innner();
        in.show();
    }
}

class accessPrivateInnerNumber {
    public static void main(String[] args) {
        Outter ou = new Outter();
        ou.showInner();
    }
}