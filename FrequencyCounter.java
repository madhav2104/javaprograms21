import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
        String s = args.length > 0 ? args[0] : "hello world";
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + ": " + e.getValue());
    }
}
