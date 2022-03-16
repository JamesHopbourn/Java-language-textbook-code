import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class throwsDealWithError {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            runtimeError();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        try {
            compileTimeError();
        // throws 不处理异常，要处理还是要靠 catch
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    public static void runtimeError() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[]{0,1,2};
        System.out.println(arr[4]);
    }
    public static void compileTimeError() throws ParseException{
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);
        System.out.println(date);
    }
}
