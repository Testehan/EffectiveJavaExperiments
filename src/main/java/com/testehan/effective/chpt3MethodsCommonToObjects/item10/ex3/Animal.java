package com.testehan.effective.chpt3MethodsCommonToObjects.item10.ex3;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Animal {
    static Animal create(String name, int numberOfLegs) {
        // this class is generated in the target folder

        return new AutoValue_Animal(name, numberOfLegs);
    }

    abstract String name();
    abstract int numberOfLegs();
}