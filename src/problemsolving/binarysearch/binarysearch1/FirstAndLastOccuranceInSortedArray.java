package problemsolving.binarysearch.binarysearch1;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastOccuranceInSortedArray {
    public static List<Integer> firstAndLastOccurance(int[]nums,int target){
        List<Integer>result=new ArrayList<>();
        int n=nums.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }

        }
        result.add(first);
        result.add(last);
        return result;

    }

    public static void main(String[] args) {
        int []nums={2, 4, 6, 8, 8, 8, 11, 13};
        int k=8;
        List<Integer>result=firstAndLastOccurance(nums,k);
        System.out.println(result);

    }
}
