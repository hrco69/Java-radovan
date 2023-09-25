import javax.lang.model.element.NestingKind;

public class ProblemOne {
    public static char findTheDiffirentChar(String s, String t){
        int[] brojPonaljanjaSlova = new int[26];

        for (int i = 0; i < s.length(); i++)
            brojPonaljanjaSlova[s.charAt(i) - 'a'] ++;
        for (int i = 0; i < t.length(); i++)
            brojPonaljanjaSlova[t.charAt(i) - 'a'] ++;

        for (int i = 0 ; i < 26 ; i++){
            if(brojPonaljanjaSlova[i] != 2 && brojPonaljanjaSlova[i] != 0)
                return (char) ('a' + i);
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "abcde";
        String t = "abcd";

        char uljez = findTheDiffirentChar(s,t);
        System.out.println(uljez);
    }
}
