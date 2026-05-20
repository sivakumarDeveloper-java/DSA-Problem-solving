package problemsolving.array.array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int []nums, int target){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int []{i,j};
                }
            }
        }

        return null;
    }

    public static int[] twoSum1(int [] nums,int target){
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=13;
        int []result=twoSum1(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
