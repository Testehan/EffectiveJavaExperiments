package com.testehan.effective.chpt5Generics.item27;

import java.util.HashSet;
import java.util.Set;

// check the top right corner for the warning sigh (yellow triangle with ! )..if you click
// on it you will see all warnings from this file
public class EliminateWarnings {

    public static void main(String[] args) {

        @SuppressWarnings({"rawtypes","unchecked"})
        Set<Integer> integers = new HashSet();    // raw use of parameterized class

        Set<Integer> integers2 = new HashSet<>();   // no warnings
    }


}
