package problemsolving.array.array2;

public class LongestConsecutiveSubSequence {
    public static int longestConsecutiveSubSequnce(int []nums){
        int n=nums.length;
        int count=1;
        int result=1;
        sortArray(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else count=1;

            result=Math.max(result,count);
        }
        return result;
    }

    private static void sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int nums[]={2,4,3,1,5,7,6,9};
        int result=longestConsecutiveSubSequnce(nums);
        System.out.println(result);
    }
}
