package problemsolving.binarysearch.binarySearch3;

public class SearchIn2DMatrixII {
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            if (target < matrix[i][0] || target > matrix[i][m - 1]) continue;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] < target) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println(searchMatrix2(matrix,target));
    }
}
