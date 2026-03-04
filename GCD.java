public class GCD {
    public static void main(String[] args) {
        int a = args.length > 1 ? Integer.parseInt(args[0]) : 54;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 24;
        System.out.println("GCD = " + gcd(a, b));
    }
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
