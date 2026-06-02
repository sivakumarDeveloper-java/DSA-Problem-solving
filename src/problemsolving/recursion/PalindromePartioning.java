package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
    public static List<List<String>> palindromePartioning(String str){
        List<List<String > > result=new ArrayList<>();
        generate(0,str,new ArrayList<>(),result);
        return result;
    }
    public static void generate(int index,String str,List<String>current,List<List<String>>result){
        if(index==str.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<str.length();i++){
            String part=str.substring(index,i+1);

            if(isPalindrome(part)){
                current.add(part);
                generate(i+1,str,current,result);
                current.remove(current.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str= "ababc";
        System.out.println(palindromePartioning(str));
    }
}
