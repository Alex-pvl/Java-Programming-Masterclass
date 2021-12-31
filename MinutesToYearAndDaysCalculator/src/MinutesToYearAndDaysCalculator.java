public class MinutesToYearAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        System.out.println((minutes < 0) ? "Invalid Value" :
                minutes + " min = " + minutes/525600 + " y and " +
                        (minutes%525600)/1440 + " d");
    }
}
