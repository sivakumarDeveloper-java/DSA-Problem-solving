package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<String> powerSet(String str){
        List<String> result=new ArrayList<>();
        generate(0,str,"",result);
        for(int i=0;i<result.size();i++){
            for(int j=i+1;j<result.size();j++){
                if(result.get(i).compareTo(result.get(j))>0){
                    String temp=result.get(i);
                    result.set(i, result.get(j));
                    result.set(j,temp);
                }
            }
        }

        return result;
    }
    public static void generate(int index,String str,String current,List<String>result){
        if(index==str.length()){
            if(current.length()!=0){
                result.add(current);
            }
            return;
        }
        generate(index+1,str,current+str.charAt(index),result);
        generate(index+1,str,current,result);
    }

    public static void main(String[] args) {
        String str="abc";
        List<String>ans=powerSet(str);
        System.out.println(ans);
    }
}
