import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] res = new int[number];
        for (int i = 0; i < number; i++) {
            res[i] = scanner.nextInt();
        }
        return res;
    }
    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
