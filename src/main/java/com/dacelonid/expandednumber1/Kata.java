package com.dacelonid.expandednumber1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Kata {
    static String expandedForm(int number) {
        List<String> result = new ArrayList<>();
        int x = 0;
        while (number > 0) {
            int num = number % (int)(Math.pow(10, x++));
            if(num != 0){
                result.add(0, "" + num);
            }
            number = number - num;
        }

        return String.join(" + ", result);
    }
}
