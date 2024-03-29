package com.testehan.effective.chpt7LambasStreams.item47;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Adapters {
    // Adapter from  Stream<E> to Iterable<E> (
    public static <E> Iterable<E> iterableOf(Stream<E> stream) {
        return stream::iterator;
    }

    /*
        With this adapter, you can iterate over any stream with a for-each statement:
        for (ProcessHandle p : iterableOf(ProcessHandle.allProcesses())) {
            // Process the process
        }
     */


    // Adapter from Iterable<E> to Stream<E>
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
