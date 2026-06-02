package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static List<List<Integer>> combinationSumIII(int n,int k){
        List<List<Integer>> result=new ArrayList<>();
        generate(1,n,k,new ArrayList<>(),result);
        return result;
    }

    private static void generate(int num, int target, int k, ArrayList<Integer> current, List<List<Integer>> result) {
        if(target==0 && current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        if(num>9 || num<0 || current.size()>k) return;

        current.add(num);
        generate(num+1,target-num,k,current,result);
        current.remove(current.size()-1);
        generate(num+1,target,k,current,result);
    }

    public static void main(String[] args) {
        int k=3;
        int n=9;
        System.out.println(combinationSumIII(n,k));
    }
}
