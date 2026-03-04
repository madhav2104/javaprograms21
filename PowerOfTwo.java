public class PowerOfTwo {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 16;
        System.out.println(n + (isPowerOfTwo(n) ? " is" : " is not") + " a power of 2");
    }
    static boolean isPowerOfTwo(int n) { return n > 0 && (n & (n - 1)) == 0; }
}
