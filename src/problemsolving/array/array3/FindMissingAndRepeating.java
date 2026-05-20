package problemsolving.array.array3;

import java.util.ArrayList;
import java.util.List;

public class FindMissingAndRepeating {
    public static List<Integer> findMissingAndRepeating(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int expectedSquareSum = n * (n + 1) * (2 * n + 1) / 6;

        int actualSum = 0;
        int actualSquareSum = 0;

        for (int num : nums) {
            actualSum += num;
            actualSquareSum += num * num;
        }
        int sumDifference = expectedSum - actualSum;
        int squareSumDifference = expectedSquareSum - actualSquareSum;

        int sumOfNumbers = squareSumDifference / sumDifference;

        int missingNumber = (sumDifference + sumOfNumbers) / 2;
        int repeatingNumber = missingNumber - sumDifference;

        List<Integer> result = new ArrayList<>();
        result.add(repeatingNumber);
        result.add(missingNumber);

        return result;
    }

    public static void main(String[] args) {
        int [] nums={3,1,3};
       List<Integer>result= findMissingAndRepeating(nums);
        System.out.println(result);
    }
}
