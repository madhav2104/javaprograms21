public class Factorial {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        long f = 1; for (int i = 2; i <= n; i++) f *= i;
        System.out.println(n + "! = " + f);
    }
}
