package problemsolving.array.array2;

public class SetMatrix0 {
    public static void setMatrix(int [][]matrix){
        int rLen= matrix.length;
        int cLen=matrix[0].length;

        int [] row=new int[rLen];
        int [] col=new int[cLen];

        for(int i=0;i<rLen;i++){
            for(int j=0;j<cLen;j++){
                if(matrix[i][j]==0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0;i<rLen;i++){
            for(int j=0;j<cLen;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[][]matrix={ {1,1,1,1,1},
                        {1,0,0,0,1},
                        {1,1,1,0,1},
                        {1,1,1,1,1},
                        {1,1,1,1,1}};

        setMatrix(matrix);
        for(int[] nums :matrix){
            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
