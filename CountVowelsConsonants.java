public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = args.length > 0 ? args[0].toLowerCase() : "hello";
        int v = 0, c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) v++;
            else if (Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels=" + v + ", Consonants=" + c);
    }
}
