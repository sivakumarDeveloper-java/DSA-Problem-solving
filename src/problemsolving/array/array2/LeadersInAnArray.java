package problemsolving.array.array2;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    public static List<Integer> leadersArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (nums[i] < nums[j])
                    break;
            }
            if (j == n)
                list.add(nums[i]);
        }
        return list;
    }
    public static List<Integer> leadersArray1(int nums[]) {
        List <Integer> list=new ArrayList<>();
        int n = nums.length;
        int maxRight = nums[n - 1];
        list.add(0,maxRight);

        for (int i=n-2;i>0;i--){
            if(nums[i]>maxRight){
                maxRight=nums[i];
                list.add(0,nums[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        List<Integer> result = leadersArray1(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}