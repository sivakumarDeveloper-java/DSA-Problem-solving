package problemsolving.binarysearch.binarysearch2;

public class KthElementForTwoSortedArrays {
    public static int KthElementOfTwoSortedArrays(int []nums1, int []nums2 ,int target){

        int m=nums1.length;
        int n=nums2.length;

        int totalLength=m+n;
        int [] merged=new int[totalLength];

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
        return merged[target-1];
    }

    public static void main(String[] args) {
        int []nums1={2, 3, 6, 7, 9};
        int []nums2={1, 4, 8, 10};
        int target=5;

        System.out.println(KthElementOfTwoSortedArrays(nums1,nums2,target));
    }
}
