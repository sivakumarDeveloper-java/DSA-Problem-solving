package problemsolving.array.array1;

public class SingleNumber {
    public static int singleNumber(int [] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1) return nums[i];
        }
        return -1;
    }
    public static int singleNumber1(int[] nums){
        int res=0;
        for (int num:nums){
            res=res^num;
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums={1,1,3,4,5,4,5,7,8,9,8,7,9};
        int result=singleNumber1(nums);
        System.out.println(result);
    }
}
