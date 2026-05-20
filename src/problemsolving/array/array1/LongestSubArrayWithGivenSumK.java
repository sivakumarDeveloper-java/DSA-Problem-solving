package problemsolving.array.array1;

public class LongestSubArrayWithGivenSumK {
    public static int longestSubArraySum(int nums[],int k){
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum;
                if (i == 0) {
                    sum = prefix[j];
                } else {
                    sum = prefix[j] - prefix[i - 1];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,1,1,1};
        int k=3;
        int result=longestSubArraySum(arr,k);
        System.out.println(result);
    }
}
