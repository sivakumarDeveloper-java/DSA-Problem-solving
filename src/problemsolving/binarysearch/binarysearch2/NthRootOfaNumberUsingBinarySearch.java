package problemsolving.binarysearch.binarysearch2;

public class NthRootOfaNumberUsingBinarySearch {
    public static int nthRootOfANumber(int n,int m){

        int start=0;
        int end=m;

        while(start<=end){

            int mid=start+(end-start)/2;
            int squareNumber=calculatePower(mid,n,m);

            if(squareNumber==m) return mid;
            else if(squareNumber<m) start=mid+1;
            else end=mid-1;

            }
        return -1;
        }


    private static int calculatePower(int base, int n,int limit) {
        int result=1;

        for (int i=0;i<n;i++){
            result*=base;
            if(result>limit){
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int m=81;
        int n=2;
        System.out.println(nthRootOfANumber(n,m));
    }
}
