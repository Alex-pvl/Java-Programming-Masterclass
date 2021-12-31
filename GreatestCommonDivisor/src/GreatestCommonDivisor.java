public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) return -1;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

}
