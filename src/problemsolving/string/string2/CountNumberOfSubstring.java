package problemsolving.string.string2;

public class CountNumberOfSubstring {
    public static int numberOfSubstring(String str){
        int n=str.length();
        int total=0;
        int []lastPos={-1,-1,-1};

        for(int pos=0;pos<n;pos++){
            lastPos[str.charAt(pos)-'a']=pos;

            total= total+ 1 + Math.min(lastPos[0],Math.min(lastPos[1],lastPos[2]));
        }
        return total;
    }

    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(numberOfSubstring(str));
    }
}
