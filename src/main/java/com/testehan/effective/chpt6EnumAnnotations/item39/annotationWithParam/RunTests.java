package com.testehan.effective.chpt6EnumAnnotations.item39.annotationWithParam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    This code is similar to the code we used to process Test annotations, with one
    exception: this code extracts the value of the annotation parameter and uses it to
    check if the exception thrown by the test is of the right type
*/
public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("com.testehan.effective.chpt6EnumAnnotations.item39.annotationWithParam.Sample2");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Throwable> excType =
                            m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf(
                                "Test %s failed: expected %s, got %s%n",
                                m, excType.getName(), exc);
                    }
                } catch (Exception exc) {
                    System.out.println("Invalid @ExceptionTest: " + m);
                }
            }
        }

        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
