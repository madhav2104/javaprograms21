public class SumOfDigits {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 9876;
        int s = 0; while (n > 0) { s += n % 10; n /= 10; }
        System.out.println("Sum = " + s);
    }
}
