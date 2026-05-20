package problemsolving.string.string2;

public class LongestPalindromicSubstring {
    public static String longestPalindromicSubstring(String str){
        int n=str.length();
        int start=0;
        int max=1;

        for(int i=0;i<n;i++){
            int odd=maxLength(str,i,i);
            int even=maxLength(str,i,i+1);

            int len=Math.max(odd,even);
            if(max<len) {
                max=len;
                start=i-(len-1)/2;
            }
        }
        return str.substring(start,start+max);
    }
    public static int maxLength(String s,int start,int end){
        while(start>=0 && end<s.length()){
            if(s.charAt(start) != s.charAt(end)){
                break;
            }
            start--;
            end++;
        }
        return end-start-1;
    }

    public static void main(String[] args) {
        String str="forgeeksskeegfor";
        System.out.println(longestPalindromicSubstring(str));
    }
}
