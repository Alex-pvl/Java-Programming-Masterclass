public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(808));
    }

    public static boolean isPalindrome(int number) {
        int val = Math.abs(number), reverse = 0;

        while (val != 0) {
            reverse *= 10;
            reverse += val % 10;
            val /= 10;

        }
        System.out.println(reverse + " " + number);
        return Math.abs(reverse) == Math.abs(number);
    }
}
