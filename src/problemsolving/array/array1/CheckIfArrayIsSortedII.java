package problemsolving.array.array1;

public class CheckIfArrayIsSortedII {
    public static boolean checkArrayIsSorted(int [] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(arr[(i+1)%n]<arr[i])
                count++;
        }
        if(count >1) return false;

        return true;
    }

    public static void main(String[] args) {
        int nums[]={5,6,7,1,2,3,4};
        boolean result=checkArrayIsSorted(nums);
        System.out.println(result);
    }
}
