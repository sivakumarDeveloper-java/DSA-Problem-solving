package problemsolving.array.array1;

public class SecondLargestElement {
    public static int secondLargest(int arr[]){
        int n=arr.length;
        int max=0;
        int secondMax=0;

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            } else if (secondMax<arr[i]) {
                secondMax=arr[i];

            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int []nums={10,30,20,42,90,46,76};
        int result=secondLargest(nums);
        System.out.println(result);
    }
}
