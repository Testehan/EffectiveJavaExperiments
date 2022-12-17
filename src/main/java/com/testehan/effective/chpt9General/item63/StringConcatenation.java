package com.testehan.effective.chpt9General.item63;

public class StringConcatenation {

    public static void main(String[] args) {
//        withConcatenationOperator();

        withStringBuilder();
    }

    private static void withStringBuilder() {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < 1000000; i++)               // waaaaayy more faster
            b.append("lineForItem(i)");

    }

    private static void withConcatenationOperator() {
        String result = null;
        for (int i = 0; i < 50000; i++)                 // this even if it has a lower number it still takes way longer
            result = result + "lineForItem(i)";
    }
}
