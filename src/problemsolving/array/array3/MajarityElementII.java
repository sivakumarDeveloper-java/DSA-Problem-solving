package problemsolving.array.array3;

import java.util.ArrayList;
import java.util.List;

public class MajarityElementII {
    public static List<Integer> majarityElement(int[] nums){
        int n=nums.length;
        int candidate1=0;
        int candidate2=0;

        int count1=0;
        int count2=0;

        for(int num:nums){
            if(num==candidate1)count1++;
            else if(num==candidate2) count2++;
            else if(count1==0) {
                candidate1=num;
                count1=1;
            }
            else if(count2 ==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int num:nums){
            if(num==candidate1) count1++;
            else if (num==candidate2) count2++;

        }
        List<Integer>result=new ArrayList<>();
        if(count1 > n/3) result.add(candidate1);
        if(count2 > n/3) result.add(candidate2);

        if(result.size()==2 && result.get(0)> result.get(1)){
            int temp= result.get(0);
            result.set(0, result.get(1));
            result.set(1,temp);

        }
        return result;
    }

    public static void main(String[] args) {
        int []nums={2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer> result=majarityElement(nums);
        for (int num:result){
            System.out.print(num+" ");
        }
    }
}
