public class PalindromeNumber {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 121;
        int x = n, rev = 0;
        while (x > 0) { rev = rev * 10 + x % 10; x /= 10; }
        System.out.println(n + (rev == n ? " is Palindrome" : " is Not Palindrome"));
    }
}
