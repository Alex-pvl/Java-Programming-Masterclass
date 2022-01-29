public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int sum = 0;
		if (number < 0) return -1;
		int d;
		while (number != 0) {
			d = number % 10;
			if (d % 2 == 0) {
				sum += d;
			}
			number /= 10;
		}
		return sum;
	}
}
