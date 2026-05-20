package problemsolving.array.array1;

public class CheckIfArrayIsSorted {
    public static boolean sortedArray(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]) return false;
            }
         return true;
        }

    public static void main(String[] args) {
        int nums[]={10,20,70,40,50,60,70};
        boolean result=sortedArray(nums);
        System.out.println(result);
    }
    }

