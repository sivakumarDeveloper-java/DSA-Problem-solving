package problemsolving.string.string1;

public class LongestOddNumberInString {
    public static String longestOddNumber(String num){
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            char ch=num.charAt(i);
            if(ch%2!=0){
                String word=num.substring(0,i+1);
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String num="1234";
        String result = longestOddNumber(num);
        System.out.println(result);
    }
}
