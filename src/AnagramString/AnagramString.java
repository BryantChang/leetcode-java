package AnagramString;
import java.util.Arrays;
/**
 * Created by bryant_chang on 16/8/19.
 */
public class AnagramString {
    public static String sortCharacters(String str){
        char[] str_arr = str.toLowerCase().toCharArray();
        Arrays.sort(str_arr);
        return String.valueOf(str_arr);
    }

    //sort based
    public static boolean isAnagram(String s, String t) {
        boolean is_anagram = false;
        if(s.length() != t.length()) {
            is_anagram = false;
        }

        s = sortCharacters(s);
        t = sortCharacters(t);
        if(s.equals(t)) {
            is_anagram = true;
        }else {
            is_anagram = false;
        }
        return is_anagram;
    }

    //hash table based
    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int char_counter[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char_counter[s.charAt(i) - 'a']++;
            char_counter[t.charAt(i) - 'a']--;
        }
        for(int count: char_counter) {
            if(count!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "anagram";
        String str2 = "nagaram";
        if(isAnagram2(str1, str2)) {
            System.out.println("is anagram");
        }else {
            System.out.println("not anagram");
        }
    }

}

