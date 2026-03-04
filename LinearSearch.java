public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {4,2,7,1,9};
        int key = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println("Index: " + linearSearch(a, key));
    }
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) if (a[i] == key) return i;
        return -1;
    }
}
