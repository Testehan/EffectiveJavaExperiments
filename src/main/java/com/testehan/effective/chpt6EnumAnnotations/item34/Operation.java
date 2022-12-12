package com.testehan.effective.chpt6EnumAnnotations.item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public enum Operation {
    PLUS("+"){
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-"){
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*"){
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/"){
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    /*
        Enum types have an automatically generated valueOf(String) method that translates a constant’s name into the
        constant itself. If you override the toString method in an enum type, consider writing a fromString method to
        translate the custom string representation back to the corresponding enum

        Note that the Operation constants are put into the stringToEnum map from a
        static field initialization that runs after the enum constants have been created.

        Enum constructors aren’t permitted to access the enum’s static fields, with the exception of constant variables
        (Item 34). This restriction is necessary because static fields have not yet been initialized when
        enum constructors run. A special case of this restriction is that enum constants cannot access one another from
        their constructors.
     */
    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(toMap(Object::toString, e -> e));

    Operation(String symbol) {
        this.symbol = symbol;
    }

    // Returns Operation for string, if any
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    @Override
    public String toString() {
        return symbol;
    }

    // THIS will be implemented by each enum value
    public abstract double apply(double x, double y);


    public static void main(String[] args) {
        double x = 8;
        double y = 2;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
