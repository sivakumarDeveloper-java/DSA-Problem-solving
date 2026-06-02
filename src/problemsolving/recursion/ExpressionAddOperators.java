package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class ExpressionAddOperators {
    public static List<String > expressionAddOperators(String num,int target){
        List<String> result=new ArrayList<>();
        dfs(num,target,0,"",0,0,result);
        return result;
    }
    public static void dfs(String num,int target,int index,String path,int current,int prev,List<String> result){
        if(index==num.length()){
            if(target==current){
                result.add(path);
            }
            return;
        }
        for(int i=index;i<num.length();i++){
            if(i>index && num.charAt(index)=='0'){
                break;
            }
            String str=num.substring(index,i+1);
            int value=Integer.parseInt(str);

            if(index==0){
                dfs(num,target,i+1,str,value,value,result);
            }
            else {
                dfs(num,target,i+1,path+"+"+str,current+value,value,result);
                dfs(num,target,i+1,path+"-"+str,current-value,-value,result);
                dfs(num,target,i+1,path+"*"+str,(current-prev)+(prev*value),prev*value,result);
            }
        }
    }

    public static void main(String[] args) {
        String num="123";
        int target=6;
        System.out.println(expressionAddOperators(num,target));
    }
}
