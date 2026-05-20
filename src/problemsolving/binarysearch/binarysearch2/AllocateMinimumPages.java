package problemsolving.binarysearch.binarysearch2;

public class AllocateMinimumPages {
    public static int allocateMinPages(int []arr,int k){
        int n=arr.length;

        int low=Integer.MIN_VALUE;
        int high=0;

        for(int num:arr){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(canAllocate(arr,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    private static boolean canAllocate(int[] arr, int k, int maxPages) {
        int student=1;
        int page=0;

        for(int num:arr){
            if(num+page<=maxPages){
                page+=num;
            }
            else{
                student++;
                page=num;
            }
        }
        return student<=k;
    }

    public static void main(String[] args) {
        int []arr={12, 34, 67, 90};
        int k=2;
        System.out.println(allocateMinPages(arr,k));
    }

}
