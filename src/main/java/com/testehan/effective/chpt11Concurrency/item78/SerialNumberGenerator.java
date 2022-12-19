package com.testehan.effective.chpt11Concurrency.item78;

import java.util.concurrent.atomic.AtomicLong;

public class SerialNumberGenerator {
    // Lock-free synchronization with java.util.concurrent.atomic
    private static final AtomicLong nextSerialNum = new AtomicLong();

    public static long generateSerialNumber() {
        return nextSerialNum.getAndIncrement();
    }

    public static void main(String[] args) {

        for (int i=0;i<10;i++) {
            Thread backgroundThread = new Thread(() -> {
                System.out.println(SerialNumberGenerator.generateSerialNumber());
            });
            backgroundThread.start();
        }
    }
}
