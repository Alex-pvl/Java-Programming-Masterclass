import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg;
        while (scanner.hasNextInt()) {
            int cur = scanner.nextInt();
            sum += cur;
            count++;
            scanner.nextLine();
        }
        if (count == 0) {
            avg = 0;
        } else avg = (long) Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
