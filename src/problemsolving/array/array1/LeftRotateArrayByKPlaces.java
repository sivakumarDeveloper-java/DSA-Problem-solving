package problemsolving.array.array1;

public class LeftRotateArrayByKPlaces {
    public static void reverse(int nums[],int start ,int end ){
        while(start <end ){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9};
        int n=nums.length;
        int k=3;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
