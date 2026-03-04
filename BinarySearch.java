public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,3,5,7,9,11};
        int key = args.length > 0 ? Integer.parseInt(args[0]) : 7;
        System.out.println("Index: " + binarySearch(a, key));
    }
    static int binarySearch(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) return m;
            if (a[m] < key) l = m + 1; else r = m - 1;
        }
        return -1;
    }
}
