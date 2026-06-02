package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static List<String> letterCombinationPhoneNumber(String num){
        List<String> result=new ArrayList<>();

        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        dfs(num,0,"",map,result);
        return result;
    }
    public static void dfs(String num,int index,String temp,String [] map,List<String>result){
        if(index==num.length()){
            result.add(temp);
            return;
        }
        String letter=map[num.charAt(index)-'0'];
        for(int i=0;i<letter.length();i++){
            dfs(num,index+1,temp+letter.charAt(i),map,result);
        }


    }

    public static void main(String[] args) {
        String num="234";
        System.out.println(letterCombinationPhoneNumber(num));
    }
}
