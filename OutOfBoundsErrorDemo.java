public class OutOfBoundsErrorDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        show();
        System.out.println("结束");
    }
    public static void show(){
         try {
             int[] arr = new int[]{0,1,2};
             System.out.println(arr[4]); // new ArrayIndexOutOfBoundsException()
         }catch (ArrayIndexOutOfBoundsException e){
             // 最全面的信息
             System.out.println("访问数组索引不存在");
             // 原因：Index 4 out of bounds for length 3
             System.out.println("原因：" + e.getMessage());
             // toString：java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
             System.out.println("toString：" + e.toString());
         }
    }
}

/*
- ArrayIndexOutOfBoundsException
- 祖宗 java.lang.Throwable
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
	at com.done.ErrorDemo.show(ErrorDemo.java:11)
	at com.done.ErrorDemo.main(ErrorDemo.java:6)
 */