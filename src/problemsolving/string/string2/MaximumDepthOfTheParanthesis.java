package problemsolving.string.string2;

public class MaximumDepthOfTheParanthesis {
    public static int maximumDepthParanthesis(String s){
        int ans=0;
        int brackets=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(') brackets++;
            else if(ch==')') brackets--;
            ans=Math.max(ans,brackets);
        }
        return ans;
    }

    public static void main(String [] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maximumDepthParanthesis(s));
    }
}
