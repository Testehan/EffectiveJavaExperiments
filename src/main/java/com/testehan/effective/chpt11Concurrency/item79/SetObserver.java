package com.testehan.effective.chpt11Concurrency.item79;

// Set observer callback interface
public interface SetObserver<E> {
    // Invoked when an element is added to the observable set
    void added(ObservableSet<E> set, E element);
}
