package problemsolving.recursion;

public class StringToIntegerAtoi {
    public static int stringToInteger(String str) {
        int i=0;
        int n=str.length();
        int total=0;
        int sign=1;
        while(i<n && str.charAt(i)==' ') i++;
        if(i<n &&(str.charAt(i)=='-' || str.charAt(i)=='+')){
            if(str.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        while (i<n && Character.isDigit(str.charAt(i))){
            int digit=str.charAt(i)-'0';

            if(total>(Integer.MAX_VALUE-digit)/10){
                if(sign==1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            total=total*10+digit;
            i++;
        }
        return total*sign;
    }

    public static void main(String[] args) {
        String str="    -41";
        System.out.println(stringToInteger(str));
    }
}
