package problemsolving.string.string3;

public class CountPalindromicSubSequences {

        public static int countPalindromes(String s) {

            int n = s.length();
            int count = 0;

            for (int i = 0; i < n; i++) {

                for (int j = i + 1; j < n; j++) {

                    for (int k = j + 1; k < n; k++) {

                        for (int l = k + 1; l < n; l++) {

                            for (int m = l + 1; m < n; m++) {

                                // Check palindrome
                                if (s.charAt(i) == s.charAt(m) &&
                                        s.charAt(j) == s.charAt(l)) {

                                    count++;
                                }
                            }
                        }
                    }
                }
            }

            return count;
        }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(countPalindromes(str));
    }
    }

