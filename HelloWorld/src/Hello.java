public class Hello {

    public static void main(String[] args) {
        displayHighScorePosition("First", calculateHighScorePosition(1500));
        displayHighScorePosition("Second", calculateHighScorePosition(900));
        displayHighScorePosition("Third", calculateHighScorePosition(400));
        displayHighScorePosition("Fourth", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String name, int rating) {
        System.out.println(name + " managed to get into position " +
                rating + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
