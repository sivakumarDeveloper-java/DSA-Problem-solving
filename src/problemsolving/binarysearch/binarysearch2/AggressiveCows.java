package problemsolving.binarysearch.binarysearch2;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggrssiveCows(int [] stalls,int k){
        int n=stalls.length;
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[n-1]-stalls[0];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;

            if(canPlace(stalls,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;

    }

    private static boolean canPlace(int[] arr, int k, int distance) {
        int count=1;
        int lastPlace=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-lastPlace>=distance){
                count++;
                lastPlace=arr[i];
            }
        }
        return count>=k;
    }

    public static void main(String[] args) {
        int []arr={1,2,4,8,9};
        int k=3;
        int result=aggrssiveCows(arr,k);
        System.out.println(result);
    }
}
