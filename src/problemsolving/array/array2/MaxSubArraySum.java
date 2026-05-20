package problemsolving.array.array2;

public class MaxSubArraySum {
    public static int maxSubArraySum(int nums[]){
        int n= nums.length;
        int currentSum=0;
        int maxSum=nums[0];
        for(int i=0; i<n;i++){
            currentSum=currentSum+nums[i];
            if (currentSum>maxSum) maxSum=currentSum;
            if(currentSum<0) currentSum=0;
        }
        return maxSum;
    }
    public static int maxSubArraySum1(int[] nums){
        int n=nums.length;
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<n;i++){
            currentSum=currentSum+nums[i];
            currentSum=Math.max(currentSum,nums[i]);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxSubArraySum1(nums);
        System.out.println(result);
    }
}
