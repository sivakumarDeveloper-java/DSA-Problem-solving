package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static List<String> ratInMaze(int mat[][]){
        List<String>result=new ArrayList<>();
        int n=mat.length;
        if(mat[0][0]==0) return result;
        dfs(0,0,n,mat,"",result);
        return result;
    }
    public static void dfs(int row,int col,int n,int[][]mat,String path,List<String>result){
        if(row==n-1 && col==n-1){
            result.add(path);
            return;
        }
        mat[row][col]=0;
        if(row+1<n && mat[row+1][col]==1)  dfs(row+1,col,n,mat,path+"D",result);
        if(row-1>=0 && mat[row-1][col]==1) dfs(row-1,col,n,mat,path+"U",result);
        if(col+1<n && mat[row][col+1]==1)  dfs(row,col+1,n,mat,path+"R",result);
        if(col-1>=0 && mat[row][col-1]==1) dfs(row,col-1,n,mat,path+"L",result);

        mat[row][col]=1;
    }

    public static void main(String[] args) {
        int [][] mat= {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(ratInMaze(mat));
    }
}
