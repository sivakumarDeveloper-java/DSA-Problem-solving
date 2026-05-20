package problemsolving.array.array3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode4sum {
    public static List<List<Integer>> fourSum(int []arr,int target){
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j+1]) continue;

                int left=j+1;
                int right=n-1;

                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];

                    if(sum==target){
                        ArrayList<Integer>ans=new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[left]);
                        ans.add(arr[right]);

                        result.add(ans);

                        while(left<right && arr[left]==arr[left+1]) left++;
                        while(left<right && arr[right]==arr[right-1]) right--;

                        left++;
                        right--;

                    }
                    else if(sum<target){
                        left++;
                    }
                    else right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={2,2,2,2,2,3,6,3,8,5,7,9,1,2,3,2};
        int target=8;
        List<List<Integer>> result=fourSum(nums,target);
        System.out.println(result);
    }

}
