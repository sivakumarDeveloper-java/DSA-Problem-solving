package problemsolving.string.string1;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] str){
        int n=str.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(str[j].compareTo(str[j+1])>0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        String first=str[0];
        String last=str[n-1];

        int i=0;
        while(i<first.length() && i<last.length()){
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }
            else break;
        }
        return first.substring(0,i);
    }
    public static void main(String []args){
        String [] strs={"siva","si","sivakumar","sivaku"};
        System.out.println(longestCommonPrefix(strs) );
    }
}
