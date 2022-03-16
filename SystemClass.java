public class SystemClass {
    public static void main(String[] args) {
        // 计算 for 运行时间
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10000; i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long times = end - start;
        System.out.println("共耗时：" + times + "\n");

        System.out.println(System.currentTimeMillis());

        long seconds = System.currentTimeMillis() / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        System.out.println(years + "年");

        System.exit(0);
    }
}
