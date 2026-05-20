package problemsolving.string.string1;

public class ValidAnagram {
    public static boolean validAnagram(String str1,String str2){
        int n=str1.length();
        if(str1.length()!=str2.length()) return false;

        int [] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[str1.charAt(i)-'a']++;
            freq[str2.charAt(i)-'a']--;
        }
        for (int i=0;i<26;i++){
            if(freq[i]!=0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        System.out.println(validAnagram(str1,str2));
    }
}
