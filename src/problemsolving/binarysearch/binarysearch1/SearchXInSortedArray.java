package problemsolving.binarysearch.binarysearch1;

public class SearchXInSortedArray {
    public static int binarySearch(int[]nums,int target){
        int n=nums.length;

        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(binarySearch(nums,target));
    }
}
