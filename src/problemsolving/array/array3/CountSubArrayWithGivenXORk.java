package problemsolving.array.array3;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenXORk {
    public static int countSubArrayXor(int[]nums,int k){
        int n=nums.length;
        int res=0;

        for(int i=0;i<n;i++){
            int prev=0;
            for(int j=i;j<n;j++){     //bruteforce
                prev=prev^nums[j];

                if(prev==k) res++;
            }
        }
        return res;
    }
    public static int countSubArrayXor1(int[] nums,int k){
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int prevXor=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){            //optimal
            prevXor=prevXor^nums[i];
            if(map.containsKey(prevXor^k)){
                count+=map.get(prevXor^k);
            }
            map.put(prevXor,map.getOrDefault(prevXor,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        int k=6;

        System.out.println(countSubArrayXor(arr,k));
        System.out.println(countSubArrayXor1(arr,k));
    }
}
