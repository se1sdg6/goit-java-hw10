package com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework10Tester {

    public static void main(String[] args) {
        Homework10Tester homework10Tester = new Homework10Tester();

        List<String> firstNames = Stream.of(
                "Simon", "John", "Tony", "Jeremy", "Richard", "James", "Stephen", "Paul", "Steve", "Bill", "Ronald"
                                            ).collect(Collectors.toList());

        List<String> lastnames = Stream.of(
                "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis"
                                            ).collect(Collectors.toList());

        homework10Tester.listConverterTester(firstNames);
        homework10Tester.arrayConverterTester(new String[]{"100,29,8", "1,2,3", "10,4,5"});

        homework10Tester.infinityRandomStreamTester();
        homework10Tester.zipStreamTester(firstNames.stream(), lastnames.stream());
    }

    void listConverterTester(List<String> testList) {
        System.out.println(Converter.listToString(testList));
        System.out.println(Converter.newSortedList(testList).toString());
    }

    void arrayConverterTester(String[] arr) {
        System.out.println(Converter.getSortedNumbers(arr));
    }

    void infinityRandomStreamTester() {
        Streams.getInfinityRandomStream(25214903917L, 11, (int)Math.pow(2, 48)).limit(100).forEach(System.out::println);
    }

    void zipStreamTester(Stream<String> firstNames, Stream<String> lastNames) {
        Streams.zip(firstNames, lastNames).forEach(System.out::println);
    }
}
