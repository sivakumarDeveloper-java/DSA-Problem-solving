package problemsolving.binarysearch.binarysearch2;

public class CapacityToShipPackagesWithInDays {
    public static int capacityToship(int[] weights,int days){
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    private static boolean canShip(int[] weights, int d, int cap) {
        int days=1;
        int load=0;

        for(int w:weights){
            if(w+load<=cap){
                load+=w;
            }else{
                days++;
                load=w;
            }
        }
        return days<=d;
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        int d=5;
       int result= capacityToship(nums,d);
        System.out.println(result);
    }
}
