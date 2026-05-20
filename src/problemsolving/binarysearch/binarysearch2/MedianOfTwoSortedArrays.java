package problemsolving.binarysearch.binarysearch2;

public class MedianOfTwoSortedArrays{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int totalSize=n+m;

        int []merged=new int [totalSize];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merged[k++]=nums1[i++];
            }
            else {
                merged[k++]=nums2[j++];
            }
        }
        while(i<m){
            merged[k++]=nums1[i++];
        }
        while(j<n){
            merged[k++]=nums2[j++];
        }
        if(totalSize%2==1){
            return merged[totalSize/2];
        }
        int left=merged[(totalSize/2)-1];
        int right=merged[totalSize/2];

        return (left+right)/2.0;
    }

    public static void main(String[] args) {
        int[] nums1={1,3};
        int[] nums2={2};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}