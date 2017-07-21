package com.dacelonid.multitap;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Keypad {
    private static Map<String, Integer> keypad = Collections.unmodifiableMap(
            Stream.of(new SimpleEntry<>("a", 1), new SimpleEntry<>("b", 2), new SimpleEntry<>("c", 3), new SimpleEntry<>("d", 1),
                    new SimpleEntry<>("e", 2), new SimpleEntry<>("f", 3), new SimpleEntry<>("g", 1), new SimpleEntry<>("h", 2),
                    new SimpleEntry<>("i", 3), new SimpleEntry<>("j", 1), new SimpleEntry<>("k", 2), new SimpleEntry<>("l", 3),
                    new SimpleEntry<>("m", 1), new SimpleEntry<>("n", 2), new SimpleEntry<>("o", 3), new SimpleEntry<>("p", 1),
                    new SimpleEntry<>("q", 2), new SimpleEntry<>("r", 3), new SimpleEntry<>("s", 4), new SimpleEntry<>("t", 1),
                    new SimpleEntry<>("u", 2), new SimpleEntry<>("v", 3), new SimpleEntry<>("w", 1), new SimpleEntry<>("x", 2),
                    new SimpleEntry<>("y", 3), new SimpleEntry<>("z", 4), new SimpleEntry<>(" ", 1), new SimpleEntry<>("*", 1),
                    new SimpleEntry<>("#", 1), new SimpleEntry<>("1", 1), new SimpleEntry<>("2", 4), new SimpleEntry<>("3", 4),
                    new SimpleEntry<>("4", 4), new SimpleEntry<>("5", 4), new SimpleEntry<>("6", 4), new SimpleEntry<>("7", 5),
                    new SimpleEntry<>("8", 4), new SimpleEntry<>("9", 5), new SimpleEntry<>("0", 2)

            ).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue)));

    static int presses(String phrase) {
        return Arrays.stream(phrase.split("")).mapToInt(s -> keypad.containsKey(s.toLowerCase()) ? keypad.get(s.toLowerCase()) : new Integer(0))
                .sum();
    }
}

