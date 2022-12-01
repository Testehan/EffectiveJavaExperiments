package com.testehan.effective.chpt3MethodsCommonToObjects.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BigDecimalExample {

    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.000");

        Set s1 = new HashSet();
        s1.add(b1);
        s1.add(b2);
        System.out.println(s1);     // wait...isn't "1.0" equal to "1.000" ?
        // the two BigDecimal instances added to the set are unequal because are compared using the equals method.

        Set s2 = new TreeSet();
        s2.add(b1);
        s2.add(b2);
        System.out.println(s2);
        // the set will contain only one element because the two BigDecimal instances are equal when compared using
        // the compareTo method
    }
}
