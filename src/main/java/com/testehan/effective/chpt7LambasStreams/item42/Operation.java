package com.testehan.effective.chpt7LambasStreams.item42;

import java.util.function.DoubleBinaryOperator;

/*      Initially implemented in item34 without using lambas.. though this approach

        Lambdas make it easy to implement constant-specific behavior using the former instead of the latter. Merely pass
        a lambda implementing each enum constant’s behavior to its constructor. The constructor stores the lambda in an
        instance field, and the apply method forwards invocations to the lambda. The resulting code is simpler and clearer
        than the original version:
*/
public enum Operation {
    PLUS("+",  (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    // This is one of the many predefined functional interfaces in java.util.function (Item 44). It represents a function
    //that takes two double arguments and returns a double result.
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }


    public static void main(String[] args) {
        double x = 8;
        double y = 2;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
