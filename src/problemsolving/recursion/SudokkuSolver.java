package problemsolving.recursion;


public class SudokkuSolver {
    public static void sudokkuSolver(int [][]mat){
        dfs(mat);
    }
    public static boolean dfs(int [][] mat){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(mat[row][col]==0){
                    for(int num=1;num<=9;num++){
                        if(isSafe(row,col,mat,num)){
                            mat[row][col]=num;
                            if(dfs(mat)){
                                return true;
                            }
                            mat[row][col]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(int row,int col,int[][]mat,int num){
        for(int i=0;i<9;i++){
            if(mat[row][i]==num) return false;
        }
        for(int i=0;i<9;i++){
            if(mat[i][col]==num) return false;
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;

        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(mat[i][j]==num) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        printBoard(board);
        sudokkuSolver(board);
        printBoard(board);
    }

    private static void printBoard(int[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

