import com.alexpvl.Series;

public class Main {
    public static void main(String[] args) {
        System.out.println("com.alexpvl.Series.nSum()");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println("\ncom.alexpvl.Series.factorial()");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println("\ncom.alexpvl.Series.fibonacci()");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}
