public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2.0, 31.0) * Math.pow(10.0, 9) - 1);
        System.out.println(Math.pow(-2.0, 31.0) * Math.pow(10.0, 9) - 1);

        System.out.println();

        Integer I1 = Integer.valueOf(100);
        System.out.println(I1);

        Integer I2 = Integer.valueOf("100");
        System.out.println(I2);

        System.out.println();

        // int to String
        int number = 200;
        String s1 = "" + number;
        System.out.println(s1);

        String s2 = String.valueOf(300);
        System.out.println(s2);

        System.out.println();

        // String to int
        String s3 = "400";
        // method 1: String to Integer to int
        Integer I3 = Integer.valueOf(s3);
        int x = I3.intValue();
        System.out.println(x);

        // method2:
        System.out.println(Integer.parseInt(s3));
    }
}
