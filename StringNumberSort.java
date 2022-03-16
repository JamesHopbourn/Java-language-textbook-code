import java.util.Arrays;

public class StringNumberSort {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        // 按照空格分割 每个元素单独存储为字符串数组
        String[] strArray = s.split(" ");

        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length ; i++){
            arr[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int num: arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());

    }
}
