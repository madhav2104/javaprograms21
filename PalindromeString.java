public class PalindromeString {
    public static void main(String[] args) {
        String s = args.length > 0 ? args[0] : "madam";
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s + (s.equals(r) ? " is Palindrome" : " is Not Palindrome"));
    }
}
