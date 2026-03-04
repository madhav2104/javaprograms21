public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5, b = 9;
        a ^= b; b ^= a; a ^= b;
        System.out.println("a=" + a + ", b=" + b);
    }
}
