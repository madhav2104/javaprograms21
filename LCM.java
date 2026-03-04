public class LCM {
    public static void main(String[] args) {
        int a = args.length > 1 ? Integer.parseInt(args[0]) : 12;
        int b = args.length > 1 ? Integer.parseInt(args[1]) : 18;
        int g = gcd(a, b);
        System.out.println("LCM = " + (a / g * b));
    }
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
