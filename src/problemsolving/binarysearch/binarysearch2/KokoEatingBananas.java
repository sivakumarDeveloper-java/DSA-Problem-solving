package problemsolving.binarysearch.binarysearch2;

public class KokoEatingBananas {
    public static int kokoEatingBananas(int []piles,int h){
        int start=1;
        int end=0;

        for(int num:piles){
            end=Math.max(num,end);
        }
        while(start<=end){
            int mid=(start+end)/2;
            long hours=0;

            for(int num:piles){
                hours+=(num+(mid-1))/mid;
            }
            if(hours<=h){
                end=mid-1;
            }
            else start=mid+1;
        }
        return start;
    }

    public static void main(String[] args) {
        int []nums={3,6,7,11};
        int h=8;
        System.out.println(kokoEatingBananas(nums,h));
    }
}
