package ru.alexpvl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Challenges {
    public static void main(String[] args) {

        // 1
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String part : parts) {
                System.out.println(part);
            }
        };

        // 2
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i=0; i < s.length(); i++) {
                if (i%2==1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // 3
        System.out.println(lambdaFunction.apply("1234567890"));

        System.out.println("---------------------");

        // 5
        String res = everySecondCharacter(lambdaFunction, "1234567890");
        System.out.println(res);

        System.out.println("---------------------");

        // 6
        Supplier<String> iLoveJava = () -> "I love Java!";

        // 7
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        System.out.println("---------------------");

        // 9 + 10
        List<String> topNames2015 = Arrays.asList(
            "Amelia",
            "Olivia",
            "emily",
            "Isla",
            "Ava",
            "oliver",
            "Jack",
            "Charlie",
            "harry",
            "Jacob"
        );
        List<String> sortedNames = new ArrayList<>();
        topNames2015.forEach(name ->
            sortedNames.add(name.substring(0,1).toUpperCase() + name.substring(1)));
        sortedNames.sort(String::compareTo);
        sortedNames.forEach(System.out::println);

        System.out.println("---------------------");

        // 11
        topNames2015
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------");

        // 12
        System.out.println(topNames2015
                .stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .count()
        );

        // 13
        // print nothing
        topNames2015
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted();

        System.out.println("---------------------");

        // 14
        topNames2015
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());
    }
    // 4
    public static String everySecondCharacter(Function<String, String> func, String s) {
        return func.apply(s);
    }
}
