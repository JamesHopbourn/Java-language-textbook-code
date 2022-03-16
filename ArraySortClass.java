import java.util.Arrays;

public class ArraySortClass {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 60, 35, 2, 45, 320, 5};
        System.out.println("排序前：" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

        System.out.println();

        int[] arr2 = new int[]{3, 60, 35, 2, 45, 320, 5};
        System.out.println("排序前：" + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("排序后：" + Arrays.toString(arr2));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                // TODO 从前和从后的区别及范围
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
/*        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/
    }
}
