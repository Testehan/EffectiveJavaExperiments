package com.testehan.effective.chpt9General.item61;

import java.util.Comparator;

public class BrokenComparator {
    public static void main(String[] args) {

        // Broke
        // So what’s the problem? The first test in naturalOrder works fine. Evaluating
        // the expression i < j causes the Integer instances referred to by i and j to be
        // auto-unboxed; that is, it extracts their primitive values. The evaluation proceeds to
        // check if the first of the resulting int values is less than the second. But suppose it
        // is not. Then the next test evaluates the expression i == j, which performs an
        // identity comparison on the two object references. If i and j refer to distinct
        // Integer instances that represent the same int value, this comparison will return
        // false, and the comparator will incorrectly return 1, indicating that the first
        // Integer value is greater than the second.
//        Comparator<Integer> naturalOrder =
//                (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);

        // Fixed Comparator
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed; // Auto-unboxing
            return i < j ? -1 : (i == j ? 0 : 1);
        };

        int result = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result);
    }
}
