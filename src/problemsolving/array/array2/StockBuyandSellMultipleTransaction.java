package problemsolving.array.array2;

public class StockBuyandSellMultipleTransaction {
    public static void main(String[] args) {
        int nums[]={100, 180, 260, 310, 40, 535, 695};
        int result=bestTimetoBuy(nums);
        System.out.println(result);
    }
    public static int bestTimetoBuy(int nums[]) {
        int n = nums.length;
        int min;
        int max;
        int res = 0;
        int i = 0;
        while (i < n - 1) {
            while (i < n - 1 && nums[i] >= nums[i + 1]) {
                i++;
            }
            min = nums[i];
            while (i < n - 1 && nums[i] <= nums[i + 1]) {
                i++;
            }
            max = nums[i];
            res += (max - min);
        }

        return res;
    }
}
