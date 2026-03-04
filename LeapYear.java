public class LeapYear {
    public static void main(String[] args) {
        int y = args.length > 0 ? Integer.parseInt(args[0]) : 2024;
        boolean leap = (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
        System.out.println(y + (leap ? " is" : " is not") + " a leap year");
    }
}
