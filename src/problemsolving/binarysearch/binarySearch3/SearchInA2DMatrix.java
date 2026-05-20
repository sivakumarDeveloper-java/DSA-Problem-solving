package problemsolving.binarysearch.binarySearch3;

public class SearchInA2DMatrix {
    public static boolean searchMatrix(int [][] arr,int target){

        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //----------------------------------------------------------------------
    public static boolean searchMatrix1(int arr[][],int target){
        int n=arr.length;
        int m=arr[0].length;

        int low=0;
        int high=n-1;
        int row=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid][0]==target){
                return true;
            }
            else if(arr[mid][0]<target){
                row=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        if(row==-1) return false;
        return searchArray(arr[row],target);
    }

    private static boolean searchArray(int[] arr, int target) {
        int low=0;
        int high=arr.length;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) high=mid-1;
            else low=mid+1;
        }
        return false;

    }
    //--------------------------------------------------------------------------
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] < target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }
//--------------------------------------------------------------------
    public static void main(String[] args) {
        int [][] arr={{1,5,9},{14,20,21},{30,34,43}};
        int target=12;
        System.out.println(searchMatrix(arr,target));
        System.out.println(searchMatrix1(arr,target));
        System.out.println(searchMatrix2(arr,target));
    }
}
