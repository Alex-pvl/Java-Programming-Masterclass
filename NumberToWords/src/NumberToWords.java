public class NumberToWords {
	public static void main(String[] args) {
		numberToWords(-222);
	}

	public static void numberToWords(int number) {
		if (number < 0) System.out.println("Invalid Value");
		String s0 = "Zero", s1 = "One", s2 = "Two", s3 = "Three", s4 = "Four",
				s5 = "Five", s6 = "Six", s7 = "Seven", s8 = "Eight", s9 = "Nine";
		int rev = reverse(number);
		for (int i = 0; i < getDigitCount(number); i++) {
			int a = rev % 10;
			switch (a) {
				case 1:
					System.out.println(s1);
					break;
				case 2:
					System.out.println(s2);
					break;
				case 3:
					System.out.println(s3);
					break;
				case 4:
					System.out.println(s4);
					break;
				case 5:
					System.out.println(s5);
					break;
				case 6:
					System.out.println(s6);
					break;
				case 7:
					System.out.println(s7);
					break;
				case 8:
					System.out.println(s8);
					break;
				case 9:
					System.out.println(s9);
					break;
				case 0:
					System.out.println(s0);
					break;
			}
			rev /= 10;
		}
	}

	public static int getDigitCount(int number) {
		if (number == 0) return 1;
		if (number < 0) return -1;
		int n = 0;
		int a = number;
		while (a > 0) {
			a /= 10;
			n++;
		}
		return n;
	}

	public static int reverse(int number) {
		int res = 0, a = number;
		while (a != 0) {
			res *= 10;
			res += a % 10;
			a /= 10;
		}
		return res;
	}
}
