package com.testehan.effective.chpt11Concurrency.item83;

public class Initialization {
    // Normal initialization of an instance field
    private final FieldType field1 = computeFieldValue();

    // Lazy initialization of instance field - synchronized accessor
    private FieldType field2;
    private synchronized FieldType getField2() {
        if (field2 == null)
            field2 = computeFieldValue();
        return field2;
    }

    // Lazy initialization holder class idiom for static fields
    /*
        If you need to use lazy initialization for performance on a static field, use
        the lazy initialization holder class idiom. This idiom exploits the guarantee that a
        class will not be initialized until it is used
     */
    private static class FieldHolder {
        static final FieldType field = computeFieldValue();
    }

    private static FieldType getField() { return FieldHolder.field; }


    // Double-check idiom for lazy initialization of instance fields
    /*
        This code may appear a bit convoluted. In particular, the need for the local
        variable (result) may be unclear. What this variable does is to ensure that field
        is read only once in the common case where it’s already initialized. While not
        strictly necessary, this may improve performance and is more elegant by the standards applied to low-level
        concurrent programming. On my machine, the method above is about 1.4 times as fast as the obvious version without
         a local variable.
     */
    private volatile FieldType field4;
    private FieldType getField4() {
        FieldType result = field4;
        if (result != null)    // First check (no locking)
            return result;

        synchronized(this) {
            if (field4 == null) // Second check (with locking)
                field4 = computeFieldValue();
            return field4;
        }
    }


    /*
        Occasionally, you may need to lazily initialize an instance field that can tolerate repeated initialization. If
        you find yourself in this situation, you can use a variant of the double-check idiom that dispenses with the
        second check. It is, not surprisingly, known as the singlecheck idiom. Here is how it looks. Note that field is
        still declared volatile:
    */
    // Single-check idiom - can cause repeated initialization!(Dan: i think it means repeaded initialization from different threads)
    private volatile FieldType field5;
    private FieldType getField5() {
        FieldType result = field5;
        if (result == null)
            field5 = result = computeFieldValue();
        return result;
    }


    private static FieldType computeFieldValue() {
        return new FieldType();
    }
}
