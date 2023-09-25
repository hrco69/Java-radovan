

public class ProblemOne {
    public static char findTheDiffirentChar(String s, String t){
        int[] brojPonaljanjaSlova = new int[26];
        int maxLen = Math.max(s.length(), t.length());

        for(int i = 0; i < maxLen; i++){
            if(i < s.length())brojPonaljanjaSlova[s.charAt(i) - 'a']++;
            if(i < t.length()) brojPonaljanjaSlova[t.charAt(i) - 'a']++;
        }

        for (int i = 0 ; i < 26 ; i++){
            if(brojPonaljanjaSlova[i] != 2 && brojPonaljanjaSlova[i] != 0)
                return (char) ('a' + i);
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abcdef";

        char uljez = findTheDiffirentChar(s,t);
        System.out.println(uljez);
    }
}
