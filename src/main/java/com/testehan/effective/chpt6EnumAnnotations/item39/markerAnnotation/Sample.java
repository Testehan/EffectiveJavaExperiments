package com.testehan.effective.chpt6EnumAnnotations.item39.markerAnnotation;

/*
    Here is how the Test annotation looks in practice. It is called a marker annotation because it has no
    parameters but simply “marks” the annotated element

    The four methods that are not annotated with the Test annotation will be ignored by the testing tool.
*/

public class Sample {
    @Test
    public static void m1() { } // Test should pass
    public static void m2() { }
    @Test public static void m3() { // Test should fail
        throw new RuntimeException("Boom");
    }
    public static void m4() { }
    @Test public void m5() { } // INVALID USE: nonstatic method
    public static void m6() { }
    @Test public static void m7() { // Test should fail
        throw new RuntimeException("Crash");
    }
    public static void m8() { }
}
