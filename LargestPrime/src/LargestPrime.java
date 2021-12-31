public class LargestPrime {

    public static int getLargestPrime(int number) {
        int max = 0;
        if (number <= 1) return -1;
        for (int i = number; i > 1; i--) {
            boolean isP = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isP = false;
                    break;
                }
            }
            if (isP && (number % i == 0)) {
                max = i;
                break;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
    }
}
