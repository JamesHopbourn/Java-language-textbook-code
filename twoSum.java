import java.util.*;

public class twoSum {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 7, 9};
    System.out.println(Arrays.toString(twoSum(arr, 9)));
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}