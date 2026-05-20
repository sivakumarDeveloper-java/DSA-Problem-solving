package problemsolving.string.string2;

public class SortCharacterbyFrequncy {
    public static String sortCharacter(String str){
        int n=str.length();

        int[] frequency =new int [256];
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            frequency[ch]++;
        }
        String result="";
        for(int freq=1;freq<=n;freq++){
            for(int i=0;i<256;i++){
                char ch=(char)i;
                if(frequency[i]==freq){
                    for(int j=0;j<freq;j++){
                        result=result+ch;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(sortCharacter(str));
    }
}
