package com.dacelonid.needle;

import java.util.Objects;

public class Kata {
    private static final String MSG = "found the needle at position ";

    static String findNeedle(Object[] haystack) {
        for (int x = 0; x < haystack.length; x++) {
            if ("needle".equals(Objects.toString(haystack[x], null)))
                return MSG + x;

        }
        return MSG;
    }
}
