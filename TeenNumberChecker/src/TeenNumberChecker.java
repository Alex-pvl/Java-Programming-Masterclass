public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean isTeen(int i) {
        return (i <= 19) && (i >= 13);
    }

    public static boolean hasTeen(int i1, int i2, int i3) {
        return isTeen(i1) || isTeen(i2) || isTeen(i3);
    }
}
