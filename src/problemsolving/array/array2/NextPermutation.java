package problemsolving.array.array2;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int []nums){
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        int nums1[]={3,4,5,2,1};
        nextPermutation(nums);
        nextPermutation(nums1);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
    }
}
