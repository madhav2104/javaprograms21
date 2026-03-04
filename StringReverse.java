public class StringReverse {
    public static void main(String[] args) {
        String s = args.length > 0 ? args[0] : "abcdef";
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
