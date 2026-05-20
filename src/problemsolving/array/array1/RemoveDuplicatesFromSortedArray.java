package problemsolving.array.array1;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int []arr){
        int n= arr.length;
        int i=1;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i-1]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int []nums={1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6};
        int result=removeDuplicates(nums);
        System.out.println(result);

    }
}
