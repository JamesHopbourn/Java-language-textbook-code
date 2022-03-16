public class BoxAndUnbox {
    public static void main(String[] args) {
        // 装箱
        Integer i1 = Integer.valueOf(100);
        // 自动装箱
        Integer i2 = 100;

        // 拆箱
        i1 = i1.intValue() + 200;
        // 自动拆箱
        i1 += 200;
        System.out.println(i1);

        Integer i3 = null;
        if (i3 != null){
            i3 +=100; // NullPointerException
        }
    }
}
