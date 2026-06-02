package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParanthesis(int n){
        List <String>result=new ArrayList<>();
        generate(0,0,"",n,result);
        return result;
    }
    public static void generate(int left,int right,String current,int n,List<String>result){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(left<n){
            generate(left+1,right,current+"(",n ,result);
        }
        if(right<left){
            generate(left,right+1,current+")",n,result);
        }

    }
    public static void main(String [] args){
        int n=3;
        List <String>ans=generateParanthesis(3);
        System.out.println(ans);
    }
}
