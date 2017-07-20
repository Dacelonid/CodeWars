package com.dacelonid.sequence;

import java.util.ArrayList;
import java.util.List;

public class SequenceSum{

    public static String showSequence(int value){
        int x = 0;
        int sum = 0;
        List<String> result = new ArrayList<>();

        while(x <= value){
            result.add(""+ x);
            x = x + 1;
            sum += x;
        }

        return String.join("+", result) + " = " + sum;
    }
}