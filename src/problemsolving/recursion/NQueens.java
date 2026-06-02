package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static List<List<String>> nQueens(int n ){

        List<List<String>> result=new ArrayList<>();
        char[][]board=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        dfs(0,board,result);
        return result;
    }
    public static void dfs(int row,char[][] board,List<List<String>> result){
        int n=board.length;
        if(row==n){
            List<String> current=new ArrayList<>();
            for(int i=0;i<n;i++){
                current.add(new String(board[i]));
            }
            result.add(current);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                dfs(row+1,board,result);
                board[row][col]='.';
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board) {
        int n=board.length;
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(nQueens(n));
    }
}
