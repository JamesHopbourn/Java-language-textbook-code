import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class twoTypeErrorDemo {
    public static void main(String[] args) {
        runtimeError();
        compileTimeError();
    }
    public static void runtimeError(){
        try{
            int[] arr = new int[]{0,1,2};
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组索引越界");
            e.getMessage();
        }
    }
    public static void compileTimeError(){
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(s);
            System.out.println(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
