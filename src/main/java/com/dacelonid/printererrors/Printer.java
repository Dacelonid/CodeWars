package com.dacelonid.printererrors;

class Printer {
    static String printerError(final String printerString) {
        return printerString.chars().filter(x -> x < 'a' || x > 'm').count() + "/" + printerString.length();
    }
}
