package problemsolving.string.string3;

public class LongestHappyPrefix {
    public static String longestHappyPrefix(String str){
        int n=str.length();
        for(int len=n-1;len>=1;len--){
            String prefix=str.substring(0,len);
            String suffix=str.substring(n-len);

            if(prefix.equals(suffix)){
                return prefix;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str="level";
        System.out.println(longestHappyPrefix(str));
    }
}
