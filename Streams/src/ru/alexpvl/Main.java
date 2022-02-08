package ru.alexpvl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "O7",
                "P12", "P43",
                "G13", "G58", "G90", "g12",
                "I34", "I72", "I89"
        );

//        List<String> nums = new ArrayList<>();
//
//        someBingoNumbers.forEach(s -> {
//            if (s.toUpperCase().startsWith("G")) {
//                nums.add(s);
//            }
//        });
//        nums.sort((s1, s2) -> s1.compareTo(s2));
//        nums.forEach(s -> System.out.println(s));


        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


    }
}
