package problemsolving.string.string1;

public class IsomorphicString {
    public static boolean isomorphicString(String str1, String str2){
        int n=str1.length();

        char [] map1=new char[256];
        char [] map2=new char[256];

        for (int i=0;i<n;i++){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);

            if(map1[ch1]==0 && map2[ch2]==0){

                map1[ch1]=ch2;
                map2[ch2]=ch1;

            }
            else{
                if(map1[ch1]!=ch2 && map2[ch2]!=ch1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="acb";
        String str2="xxy";

        System.out.println(isomorphicString(str1,str2));
    }
}
