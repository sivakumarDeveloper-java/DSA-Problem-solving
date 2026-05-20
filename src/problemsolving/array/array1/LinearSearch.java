package problemsolving.array.array1;

public class LinearSearch {
    public static int linearSearch(int [] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums={12,34,56,4,5,74,67,75,33,26};
        int target=4;
        int result=linearSearch(nums,target);
        System.out.println(result);
    }
}
