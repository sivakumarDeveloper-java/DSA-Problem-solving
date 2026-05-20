package problemsolving.array.array2;

import java.util.Arrays;

public class ReArrangeArrayElementsBySign {
    public static int [] reArrangeArraySign(int []nums){
        int n=nums.length;
        int positive=0;
        int negative=1;
        int [] res =new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                res[positive]=nums[i];
                positive+=2;
            }
            else{
                res[negative]=nums[i];
                negative+=2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] nums={3,1,-2,-5,2,-4};
        int [] result=reArrangeArraySign(nums);
        System.out.println(Arrays.toString(result));
    }
}
