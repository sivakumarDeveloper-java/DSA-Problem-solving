package problemsolving.string.string3;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static int swapString(String str){
        int n= str.length();
        int open=0;
        int swap=0;

        for(char ch: str.toCharArray()){
            if(ch=='['){
                open++;
            }
            else {
                open--;
            }
            if(open<0){
                swap++;
                open=1;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        String str1="]]][[[";
        String str2="][][";
        System.out.println(swapString(str1));
        System.out.println(swapString(str2));
    }
}
