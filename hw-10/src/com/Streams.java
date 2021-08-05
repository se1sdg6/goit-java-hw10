package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static Stream<Long> getInfinityRandomStream(long a, long seed, long m) {
        Stream<Long> randStream = Stream.iterate(seed, i -> i = Math.abs((a * i + seed) % m));
        return randStream;
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstStreamList = first.toList();
        List<T> secondStreamList = second.toList();

        List<T> newStreamList = new ArrayList<>();

        int limit = Math.min(firstStreamList.size(), secondStreamList.size());
        for (int i = 0; i < limit; i++) {
            newStreamList.add(firstStreamList.get(i));
            newStreamList.add(secondStreamList.get(i));
        }

        return newStreamList.stream();
    }
}
