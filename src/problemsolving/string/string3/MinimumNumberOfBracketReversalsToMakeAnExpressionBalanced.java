package problemsolving.string.string3;

public class MinimumNumberOfBracketReversalsToMakeAnExpressionBalanced {
    public static int balancedString(String s) {
        int n = s.length();
        int open = 0;
        int reverse = 0;
        if (n % 2 != 0) return -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                if (open > 0) open--;
                else reverse++;
            }
        }
        return (open + 1) / 2 + (reverse + 1) / 2;
    }

    public static void main(String[] args) {
        String str=")(())(((";
        System.out.println(balancedString(str));
    }
}
