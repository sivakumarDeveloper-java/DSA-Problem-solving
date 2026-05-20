package problemsolving.string.string1;

public class ReveresWordsInAGivenString {
    public static String reverseWords(String s){

        int i=s.length()-1;
        String result="";
        while(i>=0){
            while(i>=0 && s.charAt(i)=='.'){
                i--;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!='.'){
                i--;
            }
            int start=i+1;
            if(start<=end){
                String word=s.substring(start,end+1);
                if(result.length()==0){
                    result=word;
                }
                else result=result+"."+word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        System.out.println(reverseWords(str));
    }
}
