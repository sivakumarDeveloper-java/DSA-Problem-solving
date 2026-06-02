package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;



public class Subset {
    public static List<List<Integer>> subset(int []nums){
        List<List<Integer>> result=new ArrayList<>();
        generate(0,nums,new ArrayList<>(),result);

        return result;
    }

    private static void generate(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generate(i + 1, nums, current, result);
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int [] nums={1,5,3};
        List<List<Integer>> ans=subset(nums);
        System.out.println(ans);
    }

    }

