package problemsolving.binarysearch.binarysearch2;

public class FindTheSmallestDevisor {
    public static int smallestDevisor(int []arr,int k){
        int low=1;
        int high=0;

        for(int val:arr){
            high=Math.max(val,high);
        }
        int ans=-1;
        while(low<=high){

            int mid=low+(high-low)/2;
            int sum=0;
            for(int val: arr){
                sum+=(val+mid-1)/mid;
            }
            if(sum<=k){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1, 2, 5, 9};
        int k=6;
        int result=smallestDevisor(nums,k);
        System.out.println(result);
    }

}
