package problemsolving.recursion;

public class WordBreak {
    public static boolean wordBreak(String s,String[]dictionary){
        return dfs(s,dictionary,0);
    }
    public static boolean dfs(String s,String[]dictionary,int index){
        if(index==s.length()){
            return true;
        }
        for(String word:dictionary){
            if(s.startsWith(word,index)){
                if(dfs(s,dictionary,index+word.length())){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        String s="Leetcode";
        String [] dictionary={"Leet","code"};
        System.out.println(wordBreak(s,dictionary));
    }
}
