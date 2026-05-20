package problemsolving.string.string3;

public class IndexOfTheFirstOccuranceInAString {
    public static int firstOccurance(String text,String word){
        int n=text.length();
        int m=word.length();
        for(int i=0;i<=n-m;i++){
            int j=0;
           while(j<m && text.charAt(i+j) == word.charAt(j)){
               j++;
           }
           if(j==m) return i;

        }
        return -1;
    }

    public static void main(String[] args) {
        String text="aadbutsad";
        String word="sad";
        System.out.println(firstOccurance(text,word));
    }
}
