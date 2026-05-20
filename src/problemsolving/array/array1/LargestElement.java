package problemsolving.array.array1;

public class LargestElement {
    public static int largestElement(int arr[]){
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums={10,20,4};
        int result=largestElement(nums);
        System.out.println(result);

    }
}
