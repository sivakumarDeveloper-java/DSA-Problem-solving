package problemsolving.array.array1;

public class MaxConsecutiveOnes {
    public static int maxConsecutiveOnes(int []nums){
        int n=nums.length;
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count=0;
            }
            count+=nums[i];
            ans=Math.max(count,ans);
        }
        return ans;
    }
    public static int maxConsecutiveOnes1(int []nums){
        int n=nums.length;
        int i=0;
        int res=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                i=j+1;
            }
          res=Math.max(res,j-i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,};
        int result=maxConsecutiveOnes1(nums);
        System.out.println(result);
    }
}
