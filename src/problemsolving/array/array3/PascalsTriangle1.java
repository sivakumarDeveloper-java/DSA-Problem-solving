package problemsolving.array.array3;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle1 {
    public static List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>>matrix=new ArrayList<>();
        for(int row=0;row<n;row++){
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<=row;i++){
                if(row==i||i==0){
                    arr.add(1);
                }
                else arr.add(matrix.get(row-1).get(i-1)+
                                matrix.get(row-1).get(i));


            }
            matrix.add(arr);
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> result=pascalTriangle(n);

        for(List<Integer> nums: result ){

            for(int num:nums){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
