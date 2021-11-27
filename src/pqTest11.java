import java.util.Comparator;

public class pqTest11 {
    public static void main(String[] args) {

    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];

        for(int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++; // 'b' - 'a' = 1
        }
        return counts;
    }

}

public class generalComparator implements Comparator<Character> {
    public int compare(Character letter1, Character letter2) {
       // int[] counts = 0;
        return counts[letter2 - 'a'] - counts[letter1 - 'a'];//从出现频率大到小排列优先级

    }

}