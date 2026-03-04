public class OddEven {
    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println(n + (n % 2 == 0 ? " is Even" : " is Odd"));
    }
}
