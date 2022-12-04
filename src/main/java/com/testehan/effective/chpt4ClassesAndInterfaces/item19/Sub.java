package com.testehan.effective.chpt4ClassesAndInterfaces.item19;

import java.time.Instant;

// Demonstration of what can go wrong when you override a method  called from constructor
public final class Sub extends Super {
    // Blank final, set by constructor
    private final Instant instant;
    Sub() {
        instant = Instant.now();
    }
    // Overriding method invoked by superclass constructor
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }
    public static void main(String[] args) {
        /*
            You might expect this program to print out the instant twice, but it prints out null
            the first time because overrideMe is invoked by the Super constructor before the
            Sub constructor has a chance to initialize the instant field. Note that this program
            observes a final field in two different states!
            Note also that if overrideMe had invoked any method on instant, it would have thrown a NullPointerException
            when the Super constructor invoked overrideMe
         */
        Sub sub = new Sub();
        sub.overrideMe();
    }
}