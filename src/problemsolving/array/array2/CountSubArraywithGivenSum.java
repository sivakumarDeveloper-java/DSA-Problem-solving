package problemsolving.array.array2;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraywithGivenSum {
    public static int countSubArraysum(int[]nums,int k){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int currentSum=0;
            for(int j=i;j<n;j++){
                currentSum+=nums[j];
                if(currentSum==k) count++;
            }
        }
        return count;
    }
    public static int countSubArraysum1(int[]nums,int k){
        int n=nums.length;
        int count=0;
        int currentSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            currentSum+=nums[i];

            if(map.containsKey(currentSum-k)){
                count+= map.get(currentSum-k);
            }

            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int []nums={10, 2, -2, -20, 10};
        int k=10;
        int result=countSubArraysum(nums,k);
        int result1=countSubArraysum1(nums,k);
        System.out.println(result);
        System.out.println(result1);
    }
}
