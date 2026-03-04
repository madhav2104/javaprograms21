import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        String a = args.length > 1 ? args[0] : "listen";
        String b = args.length > 1 ? args[1] : "silent";
        System.out.println(isAnagram(a, b));
    }
    static boolean isAnagram(String a, String b) {
        char[] x = a.replaceAll("\s", "").toLowerCase().toCharArray();
        char[] y = b.replaceAll("\s", "").toLowerCase().toCharArray();
        Arrays.sort(x); Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}
