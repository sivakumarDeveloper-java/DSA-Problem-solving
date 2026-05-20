package problemsolving.string.string2;

public class SumOfAllBeautyOfSubstring {
    public static int beautyOfSubstring(String str){
        int n=str.length();
        int total=0;
        for(int i=0;i<n;i++){
            int [] freq=new int[26];
            for(int j=i;j<n;j++){
                freq[str.charAt(j)-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }
                total+=(max-min);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String str="aaac";
        System.out.println(beautyOfSubstring(str));
    }
}
