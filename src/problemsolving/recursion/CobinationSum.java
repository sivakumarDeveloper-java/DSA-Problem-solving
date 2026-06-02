package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class CobinationSum {
    public static List<List<Integer>> combinationSum(int []arr, int target){
        List<List<Integer>> result=new ArrayList<>();
        generate(0,arr,target,new ArrayList<>(),result);
        return result;
    }
    public static void generate(int index,int []nums,int target,List<Integer>current,List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(nums.length==index || target<0) return ;

        current.add(nums[index]);
        generate(index,nums,target-nums[index],current,result);
        current.remove(current.size()-1);
        generate(index+1,nums,target,current,result);
    }

    public static void main(String[] args) {
        int []nums={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(nums,target));
    }
}
