package com.dacelonid.weeklychallenge.bonus;

class Kata {
    static String bonusTime(final int salary, final boolean bonus) {
        return "£" + (bonus ? salary * 10:salary);
    }
}
