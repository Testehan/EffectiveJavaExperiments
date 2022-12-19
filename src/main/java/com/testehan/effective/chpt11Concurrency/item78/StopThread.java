package com.testehan.effective.chpt11Concurrency.item78;

import java.util.concurrent.TimeUnit;

// Broken! - How long would you expect this program to run?
/*
    You might expect this program to run for about a second, after which the main thread sets stopRequested to true,
    causing the background thread’s loop to terminate. On my machine, however, the program never terminates:
    the background thread loops forever!
*/
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        problem();
//        fix1();
    }

    private static void problem() throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;

            while (!stopRequested)
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

    private static void fix1() throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;

            /*
                The problem is that in the absence of synchronization, there is no guarantee as
                to when, if ever, the background thread will see the change in the value of
                stopRequested made by the main thread.
            */

//            while (!stopRequested)
            while (!stopRequested())        // FIXed
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
//        stopRequested = true;
        requestStop();              // FIXED
    }


    private static synchronized void requestStop() {
        stopRequested = true;
    }
    private static synchronized boolean stopRequested() {
        return stopRequested;
    }
}
