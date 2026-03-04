public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 153;
        int x = n, sum = 0, digits = String.valueOf(n).length();
        while (x > 0) { int d = x % 10; sum += Math.pow(d, digits); x /= 10; }
        System.out.println(n + (sum == n ? " is Armstrong" : " is Not Armstrong"));
    }
}
