package problemsolving.binarysearch.binarysearch2;

public class MinimumDaysToMakeMBouquets {

    public static int minDaysMakeBouquets(int [] arr,int k,int m){

        int low= Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int val:arr){
            low=Math.min(low,val);
            high=Math.max(high,val);
        }
        int ans=-1;
        while(low<=high){

            int mid=low+(high-low)/2;

            if(canMake(arr,k,m,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;

        }
        return ans;
    }

    private static boolean canMake(int[] arr, int k, int m, int day) {

        int count=0;
        int bouquet=0;

        for(int val:arr){
            if(val<=day){
                count++;
                if(count==k){
                    bouquet++;
                    count=0;
                }
            }
            else count=0;
        }
        return bouquet>=m;
    }

    public static void main(String[] args) {
        int [] nums={3,4,2,7,13,8,5};
        int m=3;
        int k=2;
       int result= minDaysMakeBouquets(nums,k,m);
        System.out.println(result);
    }

}
