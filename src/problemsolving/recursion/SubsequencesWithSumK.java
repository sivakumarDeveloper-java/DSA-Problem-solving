package problemsolving.recursion;

public class SubsequencesWithSumK {
    public static int  subsequenceWithKsum(int [] nums,int k){
        int  ans=generate(0,nums,0,k);
        return ans;
    }

    private static int generate(int index, int[] nums, int sum, int k) {

        if(sum==k) return 1;
        if(index==nums.length) return 0;
        if(sum>k) return 0;

        int  left=generate(index+1,nums,sum+nums[index],k);
        int  right=generate(index+1,nums,sum,k);

        return left + right;
    }

    public static void main(String[] args) {
        int [] nums={10,1,2,7,6,1,5};
        int k=10;
        int  ans=subsequenceWithKsum(nums,k);
        System.out.println(ans);
    }
}
