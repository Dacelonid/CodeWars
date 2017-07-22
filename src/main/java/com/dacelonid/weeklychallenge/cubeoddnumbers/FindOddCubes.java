package com.dacelonid.weeklychallenge.cubeoddnumbers;

import java.util.Arrays;

class FindOddCubes {
    static int cubeOdd(int arr[]) {
        return Arrays.stream(arr).filter(x -> x % 2 != 0).map(x -> x * x * x).sum();
    }
}
