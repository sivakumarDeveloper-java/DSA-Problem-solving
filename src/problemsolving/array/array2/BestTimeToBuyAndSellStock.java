package problemsolving.array.array2;

public class BestTimeToBuyAndSellStock {
    public static int bestTimeToBuySell(int []nums){
        int n=nums.length;
        int profit=0;
        int min=nums[0];
        for(int i=0;i<n;i++){
            //int cost=nums[i]-min;
            min=Math.min(min,nums[i]);
            profit=Math.max(profit,nums[i]-min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int nums[]={2,4,5,3,2,4,5,5,3,2};
        int result=bestTimeToBuySell(nums);
        System.out.println(result);
    }
}
