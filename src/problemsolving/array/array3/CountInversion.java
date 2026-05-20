package problemsolving.array.array3;

public class CountInversion {
    public static int countInversion(int []nums){
        int n=nums.length;
        int inversion=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    inversion++;
                }
            }
        }
        return inversion;
    }

    public static void main(String[] args) {
        int []nums={2,4,1,3,5};
        int result=countInversion(nums);
        System.out.println(result);
    }
}
