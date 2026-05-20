package problemsolving.binarysearch.binarySearch3;

import java.util.Arrays;

public class FindPeakElementII {
    public static int[] findPeak(int [][]mat){
        int n=mat.length;
        int m=mat[0].length;

        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;

            int maxRow=0;
            for(int i=0;i<n;i++){
                if(mat[i][mid]>mat[maxRow][mid]){
                    maxRow=i;
                }
            }
            int left=Integer.MIN_VALUE;
            int right=Integer.MIN_VALUE;

            if(mid>0) left=mat[maxRow][mid-1];
            if(mid<m-1) right=mat[maxRow][mid+1];

            int current=mat[maxRow][mid];

            if(current>=left && current>=right){
                return new int[]{maxRow,mid};
            }
            else if(left >current) high=mid-1;
            else low=mid+1;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] mat ={{10,20,15},{21,30,14},{7,16,31}};
        System.out.println(Arrays.toString(findPeak(mat)));
    }
}
