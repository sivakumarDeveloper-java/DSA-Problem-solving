package problemsolving.string.string2;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String str){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res=0;
        int n= str.length();

        for(int i=0;i<n;i++){
            int current=map.get(str.charAt(i));
            if(i+1<n && current<map.get(str.charAt(i+1))){
                res=res-current;
            }
            else {
                res=current+res;
            }
        }return res;
    }

    public static void main(String [] args) {
        String str="LVIII";
        System.out.println(romanToInteger(str));
    }
}
