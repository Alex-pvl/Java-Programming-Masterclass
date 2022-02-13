package ru.alexpvl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String s = "I am a string. Yes, I am.";
        System.out.println(s);
        String yourS = s.replaceAll("I", "You");
        System.out.println(yourS);
        System.out.println(s.replaceAll( "am.$", "THE END."));
        System.out.println(s.replaceAll("[.,]", "X"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String tvTest = "tstvtkt";
        String tNotVRegRxp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegRxp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
        count = 0;
        while(tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());

        }

    }
}
