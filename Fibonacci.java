public class Fibonacci {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? " " : ""));
            long t = a + b; a = b; b = t;
        }
        System.out.println()
    }
}
