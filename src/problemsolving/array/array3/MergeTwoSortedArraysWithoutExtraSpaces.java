package problemsolving.array.array3;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpaces {

    public static void mergeTwoSortedArrays(int []firstArray,int []secondArray){

        int n=firstArray.length;
        int m=secondArray.length;

        for(int i=m-1;i>=0;i--){
            int lastElementFirst = firstArray[n-1];
            if(lastElementFirst > secondArray[i]){
                int j=n-2;
                while(j>=0 && firstArray[j]>secondArray[i]){
                    firstArray[j+1]=firstArray[j];
                    j--;
                }
                firstArray[j+1]=secondArray[i];
                secondArray[i]=lastElementFirst;

            }
        }
    }

    public static void main(String[] args) {
        int []nums1={2, 4, 7, 10};
        int []nums2={2,3};
        mergeTwoSortedArrays(nums1,nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
