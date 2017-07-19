package com.dacelonid.interest;

class Money {
    static int calculateYears(double principal, double interest, double tax, double desired) {
        if(principal >= desired) {
            return 0;
        }

        final double interestEarned = principal * interest;
        final double taxDue = interestEarned * tax;
        final double newPrincipal = principal + interestEarned - taxDue;

        return 1 + calculateYears(newPrincipal, interest, tax, desired);
    }
}
