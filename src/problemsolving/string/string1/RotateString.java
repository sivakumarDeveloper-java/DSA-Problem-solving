package problemsolving.string.string1;

public class RotateString {
    public static boolean rotateStirng(String str1,String str2){
        int n=str1.length();
        for(int i=0;i<n;i++){
            if(str1.equals(str2)){
                return true;
            }
            char last=str1.charAt(str1.length()-1);
            str1=last+str1.substring(0,str1.length()-1);
        }
        return false;
    }

    public static void main(String[] args) {
        String s="abcde";
        String goal="deabc";
        System.out.println(rotateStirng(s,goal));
    }
}
