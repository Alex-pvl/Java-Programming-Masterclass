package ru.alexpvl;

public class Main {

    public static void main(String[] args) {
	    String s = "I am a string. Yes, I am.";
        System.out.println(s);
        String yourS = s.replaceAll("I", "You");
        System.out.println(yourS);
        System.out.println(s.replaceAll( "am.$", "THE END."));
        System.out.println(s.replaceAll("[.,]", "X"));
    }
}
