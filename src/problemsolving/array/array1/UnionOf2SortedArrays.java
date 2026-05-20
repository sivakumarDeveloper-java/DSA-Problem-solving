package problemsolving.array.array1;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4,5,5,6,6,6,7,7,9};
        int[] nums2={3,4,5,6,7,8,8,9,9,9,10,10};
        unionSortedArrays(nums1,nums2);
    }
    public static void unionSortedArrays(int [] a,int [] b){
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        int i=0;
        int j=0;

        while(i<n && j<m){
            while(i+1<n && a[i]==a[i+1]) i++;
            while(j+1<m && b[j]==b[j+1]) j++;

            if(a[i]<b[j]) ans.add(a[i++]);
            else if (a[i]>b[j]) ans.add(b[j++]);
            else{
                ans.add(a[i++]);
                j++;
            }
        }
        while(i<n){
            while( i+1<n && a[i]==a[i+1]) i++;
            ans.add(a[i++]);
        }
        while(j<m){
            while(j+1<m && b[j]==b[j+1]) j++;
            ans.add(b[j++]);
        }

        for(int num :ans){
            System.out.print(num +" ");
        }

    }
}
