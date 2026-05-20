package problemsolving.binarysearch.binarysearch2;

import java.util.HashSet;
import java.util.Set;

public class KthMissingNumber {
    public static int kthMissingNumber(int []arr,int k){
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }                              // Hashset
        int current=0;
        int count=0;
        while(count<k){
            current++;
            if(!set.contains(current)){
                count++;
            }
        }
        return current;
    }
    public static int kthMissingNumber1(int []arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>(k+i)){
                return k+i;          // index comparison
            }
        }
        return k+n;
    }

    public static int kthMissingNumber2(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        int ans= arr.length+k;
        while(low<=high){                // binary search

            int mid=(low+high)/2;

            if(arr[mid]> (mid+k)){
                ans=mid+k;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static int kthMissingNumber3(int []arr,int k){
        for(int i:arr){
           if(i<=k)k++;
           else break;
        }
        return k;
    }


    public static void main(String[] args) {
        int[] num={2,3,4,7,11};
        int k=5;
        System.out.println(kthMissingNumber(num,k));
        System.out.println(kthMissingNumber1(num,k));
        System.out.println(kthMissingNumber2(num,k));
        System.out.println(kthMissingNumber3(num,k));
    }
}
