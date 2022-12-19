package com.testehan.effective.chpt11Concurrency.item79;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Broken - invokes alien method from synchronized block!
public class ObservableSet<E> extends ForwardingSet<E> {

    public ObservableSet(Set<E> set) { super(set); }

//    private final List<SetObserver<E>> observers = new ArrayList<>();

//    public void addObserver(SetObserver<E> observer) {
//        synchronized(observers) {
//            observers.add(observer);
//        }
//    }
//
//    public boolean removeObserver(SetObserver<E> observer) {
//        synchronized(observers) {
//            return observers.remove(observer);
//        }
//    }

    // invokes alien method from synchronized block! Very bad !!!!!
//    private void notifyElementAdded(E element) {
//        synchronized(observers) {
//            for (SetObserver<E> observer : observers)
//                observer.added(this, element);
//        }
//    }

    // Alien method moved outside of synchronized block - open calls
    // With this change, both of the previous examples (see main) run without exception or deadlock:
//    private void notifyElementAdded(E element) {
//        List<SetObserver<E>> snapshot = null;
//        synchronized(observers) {
//            snapshot = new ArrayList<>(observers);
//        }
//        for (SetObserver<E> observer : snapshot)
//            observer.added(this, element);
//    }

    // Thread-safe observable set with CopyOnWriteArrayList
    private final List<SetObserver<E>> observers = new CopyOnWriteArrayList<>();

    public void addObserver(SetObserver<E> observer) {
        observers.add(observer);
    }

    public boolean removeObserver(SetObserver<E> observer) {
        return observers.remove(observer);
    }

    private void notifyElementAdded(E element) {
        for (SetObserver<E> observer : observers)
            observer.added(this, element);
    }
//
    @Override public boolean add(E element) {
        boolean added = super.add(element);
        if (added)
            notifyElementAdded(element);
        return added;
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c)
            result |= add(element);  // Calls notifyElementAdded
        return result;
    }


    // For example, the  following program prints the numbers from 0 through 99

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<>());
        set.addObserver((s, e) -> System.out.println(e));

        // code below throws ConcurrentModificationException
        /*
        The problem is that notifyElementAdded is in the process of iterating over the
        observers list when it invokes the observer’s added method. The added method
        calls the observable set’s removeObserver method, which in turn calls the method
        observers.remove. Now we’re in trouble. We are trying to remove an element
        from a list in the midst of iterating over it, which is illegal.
         */

//        set.addObserver(new SetObserver<>() {
//            public void added(ObservableSet<Integer> s, Integer e) {
//                System.out.println(e);
//                if (e == 23)
//                    s.removeObserver(this);
//            }
//        });

        // Observer that uses a background thread needlessly
        // Now let’s try something odd: let’s write an observer that tries to unsubscribe,
        // but instead of calling removeObserver directly, it engages the services of another
        // thread to do the deed. This observer uses an executor service (Item 80)

        /*
            When we run this program, we don’t get an exception; we get a deadlock. The
            background thread calls s.removeObserver, which attempts to lock observers,
            but it can’t acquire the lock, because the main thread already has the lock. All the
            while, the main thread is waiting for the background thread to finish removing the
            observer, which explains the deadlock.
         */
        set.addObserver(new SetObserver<>() {
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23) {
                    ExecutorService exec = Executors.newSingleThreadExecutor();
                    try {
                        exec.submit(() -> s.removeObserver(this)).get();
                    } catch (ExecutionException | InterruptedException ex) {
                        throw new AssertionError(ex);
                    } finally {
                        exec.shutdown();
                    }
                }
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
