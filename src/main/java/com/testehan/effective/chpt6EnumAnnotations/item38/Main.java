package com.testehan.effective.chpt6EnumAnnotations.item38;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        double x = 8;
        double y = 2;
        test(ExtendedOperation.class, x, y);
        test2(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    // The admittedly complex declaration for the opEnumType parameter (<T extends
    //  Enum<T> & Operation> Class<T>) ensures that the Class object represents both
    //  an enum and a subtype of Operation, which is exactly what is required to iterate
    //  over the elements and perform the operation associated with each one.
    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    // simpler The resulting code is a bit less complex, and the test method is a bit more flexible: it allows the caller
    // to combine operations from multiple implementation types
    private static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
