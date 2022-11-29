package com.testehan.effective.chpt2CreateAndDestroyObjects.item5;

import java.util.Objects;
import java.util.function.Supplier;

public class SpellChecker {

    private final Lexicon dictionary;
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    /*
        A useful variant of the pattern is to pass a resource factory to the constructor.
        A factory is an object that can be called repeatedly to create instances of a type.
        Such factories embody the Factory Method pattern [Gamma95]. The
        Supplier<T> interface, introduced in Java 8, is perfect for representing factories.
     */
    public SpellChecker(Supplier<? extends Lexicon> lexiconSupplier) {
        this.dictionary = Objects.requireNonNull(lexiconSupplier.get());
    }

    public boolean isValid(String word) {
        // ...
        return true;
    }

}
