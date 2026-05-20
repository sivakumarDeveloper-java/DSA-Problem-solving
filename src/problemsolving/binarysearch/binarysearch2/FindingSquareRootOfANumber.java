package problemsolving.binarysearch.binarysearch2;

public class FindingSquareRootOfANumber {
    public static int squareRoot(int x){
        int start=0;             //n=36
        int end= x/2;            // x/2 -- 36/2 =18    *--18 > 6--*

        if(x<2) return x;      // edge case
        while(start<=end){
            int mid=start+(end-start)/2;
            long squareNumber= (long) mid*mid;

            if(squareNumber==x){
                return mid;
            }
            else if(squareNumber<x){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(squareRoot(n));
    }
}
