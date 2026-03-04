public class PrimeCheck {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 29;
        System.out.println(n + (isPrime(n) ? " is Prime" : " is Not Prime"));
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }
}
