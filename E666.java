import java.util.*;

public class E666 {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }

  public static void main(String args[]) {
    twoSum test = new twoSum();
    System.out.println(Arrays.toString(test.twoSum(new int[] {1, 2, 7, 9}, 9)));
  }
}
