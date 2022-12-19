package com.testehan.effective.chpt11Concurrency.item81;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

// Simple framework for timing concurrent execution
/*
    Note that the method uses three countdown latches. The first, ready, is used
    by worker threads to tell the timer thread when they’re ready. The worker threads
    then wait on the second latch, which is start. When the last worker thread
    invokes ready.countDown, the timer thread records the start time and invokes
    start.countDown, allowing all of the worker threads to proceed. Then the timer
    thread waits on the third latch, done, until the last of the worker threads finishes
    running the action and calls done.countDown. As soon as this happens, the timer
    thread awakens and records the end time.
*/
public class ConcurrentTimer {
    private ConcurrentTimer() { } // Noninstantiable

    /*
        A few more details bear noting. The executor passed to the time method must
        allow for the creation of at least as many threads as the given concurrency level, or
        the test will never complete. This is known as a thread starvation deadlock
    */
    public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done  = new CountDownLatch(concurrency);

        for (int i = 0; i < concurrency; i++) {
            executor.execute(() -> {
                ready.countDown(); // Tell timer we're ready
                try {
                    start.await(); // Wait till peers are ready
                    action.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();  // Tell timer we're done
                }
            });
        }

        ready.await();     // Wait for all workers to be ready
        long startNanos = System.nanoTime();
        start.countDown(); // And they're off!
        done.await();      // Wait for all workers to finish
        return System.nanoTime() - startNanos;
    }
    /*
        For interval timing, always use System.nanoTime rather than System.currentTimeMillis.
        System.nanoTime is both more accurate and more precise and is unaffected by adjustments to the system’s real-time clock

        This item only scratches the surface of what you can do with the concurrency
        utilities. For example, the three countdown latches in the previous example could
        be replaced by a single CyclicBarrier or Phaser instance. The resulting code
        would be a bit more concise but perhaps more difficult to understand.
     */
}
