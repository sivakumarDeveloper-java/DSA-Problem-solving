package problemsolving.array.array3;

import java.util.*;

public class Leetcode3Sum {
    public static List<List<Integer>> threeSum(int []nums){

        Set<List<Integer>> set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        int a=nums[i];
                        int b=nums[j];
                        int c=nums[k];

                        int min=Math.min(a,Math.min(b,c));
                        int max=Math.max(a,Math.max(b,c));
                        int mid=a+b+c-min-max;

                        List<Integer>triplet=new ArrayList<>();
                        triplet.add(min);
                        triplet.add(mid);
                        triplet.add(max);

                        set.add(triplet);

                    }
                }
            }
        }
    return new ArrayList<>(set);
    }
    public static List<List<Integer>> threeSum1(int []nums){
        List<List<Integer>>result=new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    ArrayList<Integer>triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    result.add(triplet);

                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr ={-1,0,1,2,-1,-4};
        List<List<Integer>>result=threeSum(arr);
        List<List<Integer>>result1=threeSum1(arr);
        System.out.println(result);
        System.out.println(result1);

    }
}
