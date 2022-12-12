package com.testehan.effective.chpt6EnumAnnotations.item39.markerAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    The test runner tool takes a fully qualified class name on the command line
    and runs all of the class’s Test-annotated methods reflectively, by calling
    Method.invoke. The isAnnotationPresent method tells the tool which methods
    to run. If a test method throws an exception, the reflection facility wraps it in an
    InvocationTargetException. The tool catches this exception and prints a failure
    report containing the original exception thrown by the test method, which is
    extracted from the InvocationTargetException with the getCause method.

*/


public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("com.testehan.effective.chpt6EnumAnnotations.item39.markerAnnotation.Sample");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
