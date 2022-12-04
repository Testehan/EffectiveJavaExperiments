package com.testehan.effective.chpt4ClassesAndInterfaces.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    The design of the InstrumentedSet class is enabled by the existence of the
    Set interface, which captures the functionality of the HashSet class. Besides
    being robust, this design is extremely flexible. The InstrumentedSet class implements the Set interface and has a
    single constructor whose argument is also of type Set. In essence, the class transforms one Set into another, adding
    the instrumentation functionality. Unlike the inheritance-based approach, which works only for a single concrete
    class and requires a separate constructor for each supported constructor in the superclass, the wrapper class can be
    used to instrument any Set implementation and will work in conjunction with any preexisting constructor:

    The InstrumentedSet class can even be used to temporarily instrument a set
    instance that has already been used without instrumentation:
        static void walk(Set<Dog> dogs) {
            InstrumentedSet<Dog> iDogs = new InstrumentedSet<>(dogs);
            ... // Within this method use iDogs instead of dogs
        }

*/

// Wrapper class - uses composition in place of inheritance  (Page 90)
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedSet<String> s = new InstrumentedSet<>(new HashSet<>());
        s.addAll(List.of("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
