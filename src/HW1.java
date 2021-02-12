public class HW1 {

    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean between10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    private static boolean positiveOrNegative(int num) {
        return num >= 0;
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }
    private static String Hello(String name) {
        return "Привет, Dasha";
    }
}