package com.testehan.effective.chpt8Methods.item52;

import java.math.BigInteger;
import java.util.*;

/*
    You might expect this program to print Set, followed by List and Unknown
    Collection, but it doesn’t. It prints Unknown Collection three times. Why does
    this happen? Because the classify method is overloaded, and the choice of
    which overloading to invoke is made at compile time.
*/



// Broken! - What does this program print?
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }
    public static String classify(List<?> lst) {
        return "List";
    }
    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }
    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }
}
