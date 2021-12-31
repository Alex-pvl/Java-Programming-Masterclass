public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-5));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int value = number, n = 0;
        while (value != 0) {
            value /= 10;
            n++;
        }
        return number%10 + (int) (number/Math.pow(10, n-1));
    }
}
