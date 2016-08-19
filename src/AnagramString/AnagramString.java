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

    public static void main(String[] args){
        String str1 = "anagram";
        String str2 = "nagarbm";
        if(isAnagram(str1, str2)) {
            System.out.println("is anagram");
        }else {
            System.out.println("not anagram");
        }
    }

}

