package problemsolving.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
    public static List<List<Integer>> subsetII(int []nums){
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        generate(0,nums,new ArrayList<>(),result);
        return result;
    }
    public static void generate(int index,int [] nums,List<Integer> current,List<List<Integer>> result){
        if(index==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        generate(index+1,nums,current,result);
        current.remove(current.size()-1);
        while(index+1 <nums.length && nums[index]==nums[index+1]) index++;
        generate(index+1,nums,current,result);
    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(subsetII(nums));
    }
}
