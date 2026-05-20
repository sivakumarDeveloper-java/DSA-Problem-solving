package problemsolving.binarysearch.binarySearch3;

public class FindRowWithMaximumOnes {
    public static int findRowWithMaxOnes(int[][] mat){

        int n=mat.length;
        int m=mat[0].length;

        int rowIndex=-1;
        int maxCount=0;

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount=count;
                rowIndex=i;
            }
        }
        return rowIndex;
    }


        public static int findFirstOne(int[] row) {
            int low = 0;
            int high = row.length - 1;
            int firstOneIndex = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (row[mid] == 1) {
                    firstOneIndex = mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            return firstOneIndex;
        }

        public static int findRowWithMaxOnes1(int[][] matrix) {

            int numberOfRows = matrix.length;
            int numberOfColumns = matrix[0].length;
            int maximumCountOfOnes = 0;
            int rowIndex = -1;

            for (int row = 0; row < numberOfRows; row++) {

                int firstOneIndex = findFirstOne(matrix[row]);
                if (firstOneIndex != -1) {
                    int countOfOnes = numberOfColumns - firstOneIndex;
                    if (countOfOnes > maximumCountOfOnes) {
                        maximumCountOfOnes = countOfOnes;

                        rowIndex = row;
                    }
                }
            }

            return rowIndex;
        }



    public static void main(String[] args) {
        int [][]mat={{0,1,1},{0,1,1},{1,1,1}};
        System.out.println(findRowWithMaxOnes(mat));
        System.out.println(findRowWithMaxOnes1(mat));
    }
}
