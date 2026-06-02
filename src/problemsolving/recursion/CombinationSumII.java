package problemsolving.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static List<List<Integer>> combinationII(int nums[],int target){
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        generate(0,nums,target,new ArrayList<>(),result);
        return result;
    }
    public static void generate(int index,int []nums,int target,List<Integer> current,List<List<Integer>> result){
        if(target==0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(index== nums.length || target<0){
            return;
        }
        current.add(nums[index]);
        generate(index+1,nums,target-nums[index],current,result);

        current.remove(current.size()-1);

        while(index+1<nums.length && nums[index]==nums[index+1]){
            index++;
        }
        generate(index+1,nums,target,current,result);
    }

    public static void main(String[] args) {
        int [] nums={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationII(nums,target));
    }
}
