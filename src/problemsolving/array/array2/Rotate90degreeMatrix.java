package problemsolving.array.array2;

public class Rotate90degreeMatrix {

    public static void rotateMatrix(int [][]matrix){
        int n= matrix.length;
        for(int i=0;i<n;i++){
            int start=0;
            int end=n-1;

            while(start<end){
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;

            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{0,1,2},{3,4,5},{6,7,8}};
        rotateMatrix(matrix);

        for(int[]nums:matrix){
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

}
