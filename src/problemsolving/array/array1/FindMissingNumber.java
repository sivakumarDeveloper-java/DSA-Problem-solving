package problemsolving.array.array1;

public class FindMissingNumber {
    public static int findMissingNumber(int[]nums){
        int n=nums.length+1;
        int count=0;
        for(int num :nums){
            count+=num;
        }
        int ans=n*(n+1)/2;
        return ans-count;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,8,9,10};
        int result=findMissingNumber(nums);
        System.out.println(result);
    }
}
