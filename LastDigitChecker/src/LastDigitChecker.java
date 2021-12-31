public class LastDigitChecker {

    public static boolean isValid(int i) {
        return i > 9 && i < 1001;
    }

    public static boolean hasSameLastDigit(int i1, int i2, int i3) {
        if (!isValid(i1) || !isValid(i2) || !isValid(i3)) return false;
        i1 %= 10;
        i2 %= 10;
        i3 %= 10;
        return (i1 == i2) || (i1 == i3) || (i2 == i3);
    }
}
