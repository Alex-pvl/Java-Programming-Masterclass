public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(4,8,19));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (bigCount == 0) return smallCount >= goal;
        for (int i = bigCount * 5; i != 0; i -= 5) {
            if (i == goal) return true;
            for (int j = smallCount; j != 0; j--){
                if (i + j == goal) return true;
            }
        }
        return false;
    }
}
