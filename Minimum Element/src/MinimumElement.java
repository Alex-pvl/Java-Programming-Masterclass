import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static int[] readElements(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] res = new int[number];
        for (int i = 0; i < number; i++) {
            res[i] = scanner.nextInt();
        }
        return res;
    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
