package problemsolving.string.string1;

public class RemoveOuterMostParanthesis {
    public static String removeOutermost(String s){
        int n=s.length();
        int openCount=0;
        int closeCount=0;

        int start=0;
        String result="";

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(ch=='(') openCount++;
            else closeCount++;

            if(openCount==closeCount){
                result += s.substring(start+1,i);
                start=i+1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="(()())(())()";
        System.out.println(removeOutermost(s));

    }
}
