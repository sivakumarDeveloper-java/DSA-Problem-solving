package problemsolving.binarysearch.binarysearch1;

public class LowerBound {
    public static int lowerBound(int[]nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=n;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []nums={2, 3, 7, 10, 11, 11, 25};
        int target=9;
        System.out.println(lowerBound(nums,target));
    }
}
