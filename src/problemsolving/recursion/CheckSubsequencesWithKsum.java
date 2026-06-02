package problemsolving.recursion;

public class CheckSubsequencesWithKsum {
    public static boolean subsequenceWithKsum(int [] nums,int k){
        boolean ans=generate(0,nums,0,k);
        return ans;
    }

    private static boolean generate(int index, int[] nums, int sum, int k) {

        if(sum==k) return true;
        if(index==nums.length) return false;
        if(sum>k) return false;

        boolean left=generate(index+1,nums,sum+nums[index],k);
        boolean right=generate(index+1,nums,sum,k);

        return left || right;
    }

    public static void main(String[] args) {
        int [] nums={10,1,2,7,6,1,5};
        int k=8;
        boolean ans=subsequenceWithKsum(nums,k);
        System.out.println(ans);
    }
}
