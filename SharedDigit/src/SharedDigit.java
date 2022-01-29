public class SharedDigit {
	public static boolean hasSharedDigit(int i1, int i2) {
		if (i1 < 10 || i1 > 99 || i2 < 10 || i2 > 99) return false;
		int i11 = i1 / 10, i12 = i1 % 10;
		int i21 = i2 / 10, i22 = i2 % 10;
		if (i11 == i21 || i11 == i22 || i12 == i21 || i12 == i22) return true;
		else return false;
	}
}
