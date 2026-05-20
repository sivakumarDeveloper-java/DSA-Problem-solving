package problemsolving.string.string2;

public class StringToIntegerAtoi {
    public static int stringToInteger(String s){
        s=s.trim();
        int n=s.length();
        int sign=1;
        int i=0;
        int num=0;

        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            if(s.charAt(i)=='-') sign=-1;
            i++;
        }
        while(i<n && isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            if(num*sign >Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(num*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return num;
    }
    public static boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }

    public static void main(String[] args) {

        String str="   -454hrkijif99";
        System.out.println(stringToInteger(str));
    }
}
