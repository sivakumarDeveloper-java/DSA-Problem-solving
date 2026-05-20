package problemsolving.array.array2;

import java.util.Arrays;

public class SortAnArray012 {
    public static void sortAnArray(int nums[]){
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            if(nums[mid]==1){
                mid=mid+1;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,0,2,1,1};
        sortAnArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
