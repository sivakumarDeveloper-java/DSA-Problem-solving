package problemsolving.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public static List<String> generateBinaryStrigs(int n){
        List<String> result=new ArrayList<>();
        generateBinary(n,"",result);
        return result;
    }

    private static void generateBinary(int n, String current, List<String> result) {
        if(current.length()==n){
            result.add(current);
            return;
        }
        generateBinary(n,current+"1",result);
        if(current.length()==0 || current.charAt(current.length()-1)!='0'){
            generateBinary(n,current+"0",result);
        }
    }

    public static void main(String[] args) {
        int n =5;
        List<String> result=generateBinaryStrigs(n);
        System.out.println(result);
    }
}
