package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Converter {
    public static String listToString(List<String> names) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < names.size(); i += 2) {
            sb.append(i + "." + names.get(i) + ", ");
        }

        return sb.substring(0, sb.length() - 2);
    }

    public static List<String> newSortedList(List<String> list) {
        List<String> result = new ArrayList<>();

        for(String s : list) {
            result.add(s.toUpperCase());
        }

        Collections.sort(result);
        Collections.reverse(result);

        return result;
    }

    public static String getSortedNumbers(String[] array) {
        if (array.length == 0) return null;

        List<Integer> numbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            String[] splittedString = s.split(",");
            for (String s1 : splittedString) {
                try {
                    int i = Integer.parseInt(s1);
                    numbers.add(i);
                } catch (NumberFormatException e) {
                    //IGNORE
                }
            }
        }

        if (numbers.size() == 0) return null;


        Collections.sort(numbers);
        for (int i : numbers) {
            sb.append(i + ", ");
        }

        return sb.substring(0, sb.length() - 2);
    }
}
