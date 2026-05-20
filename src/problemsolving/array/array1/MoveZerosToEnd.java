package problemsolving.array.array1;

public class MoveZerosToEnd {

    public static void moveZeros(int [] nums){
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={0,0,0,0,0,0,1,4,3,6,8,9,33,54,7,8};
        moveZeros(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
