package Osnove;

public class LeetCodeReverseWordsInString {
    public static String reverseWords(String s) {
        StringBuilder ss = new StringBuilder();

        // string -> "hrco prco"
        int count = 0;
        for (int i = 0 ; i <= s.length(); i++ ){
            if (i == s.length() || s.charAt(i) == ' ') {
                for (int j = i - 1; j >= count; j--) {
                    ss.append(s.charAt(j));
                }
                if (i < s.length()) {
                    ss.append(s.charAt(i));
                }
                count = i + 1; // pointer na posljednju poziciju koja se moze appendati na string
            }

        }

        return ss.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
