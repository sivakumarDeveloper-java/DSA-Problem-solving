package problemsolving.array.array2;

import java.util.ArrayList;
import java.util.List;

public class PrintSubArrayWithMaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        List<Integer> result = printSubArrayMax(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> printSubArrayMax(int[] nums) {
        int n = nums.length;

        int maxSum = nums[0];
        int resStart = 0;
        int resEnd = 0;
        for (int i = 0; i < n; i++) {
            int curretnSum = 0;
            for (int j = i; j < n; j++) {

                curretnSum = curretnSum + nums[j];

                if (curretnSum > maxSum) {
                    maxSum = curretnSum;
                    resStart = i;
                    resEnd = j;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = resStart; i <= resEnd; i++) {
            list.add(nums[i]);
        }
        return list;
    }
}
//    int resStart = 0, resEnd = 0;
//
//    int currStart = 0;
//
//    int maxSum = arr[0];
//    int maxEnding = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//
//        if (maxEnding + arr[i] < arr[i]) {
//
//            maxEnding = arr[i];
//            currStart = i;
//        }
//        else {
//
//            maxEnding += arr[i];
//        }
//
//        if (maxEnding > maxSum) {
//
//            maxSum = maxEnding;
//
//            resStart = currStart;
//            resEnd = i;
//        }
//    }
//
//    List<Integer> res = new ArrayList<>();
//        for (int i = resStart; i <= resEnd; i++)
//            res.add(arr[i]);
//        return res;
//}