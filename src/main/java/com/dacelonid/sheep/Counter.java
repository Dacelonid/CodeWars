package com.dacelonid.sheep;

import java.util.Arrays;
import java.util.stream.Collectors;

class Counter {
    int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x != null && x).collect(Collectors.toList()).size();
    }
}
