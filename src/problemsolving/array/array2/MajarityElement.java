package problemsolving.array.array2;

public class MajarityElement {
    public static int majarityElement(int [] nums){
        int majarity=0;
        int count=0;

        for(int num:nums){
            if(count==0) majarity=num;
            if(num==majarity) count++;
            else count--;

        }
        return majarity;
    }

    public static void main(String[] args) {
        int []nums={2,2,1,1,1,2,2};
        int result=majarityElement(nums);
        System.out.println(result);
    }
}
