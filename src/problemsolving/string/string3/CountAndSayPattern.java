package problemsolving.string.string3;

public class CountAndSayPattern {
    public static String countAndSayPattern(int n){

        if(n==1) return "1";

        String result="1";
        for(int i=2;i<=n;i++){
            String temp="";
            int count=1;
            for(int j=0;j<result.length();j++){
                while(j<result.length()-1 && result.charAt(j)==result.charAt(j+1)){
                    count ++;
                    j++;
                }
                temp=temp+count+result.charAt(j);
            }
            result=temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(countAndSayPattern(n));
    }
}
