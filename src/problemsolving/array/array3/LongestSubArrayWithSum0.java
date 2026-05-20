package problemsolving.array.array3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSum0 {
    public static int longestSubArrayWithSumZero(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {              // brute force
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static int longestSubArrayWithSumZero1(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;                                  //optimal
        int maxLen = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                int prevSum = map.get(sum);
                int length = i - prevSum;
                maxLen = Math.max(maxLen, length);
            } else map.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(longestSubArrayWithSumZero(nums));
        System.out.println(longestSubArrayWithSumZero1(nums));
    }
}
