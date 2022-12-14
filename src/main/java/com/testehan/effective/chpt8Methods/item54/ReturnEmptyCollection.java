package com.testehan.effective.chpt8Methods.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnEmptyCollection {

    private final List<Integer> numbers = new ArrayList<>();

    // BAD approach that returns null
    public List<Integer> getNumbersBad() {
        return numbers.isEmpty() ? null : numbers;
    }

    // GOOD approach that returns empty collection
    public List<Integer> getNumbers() {
        return numbers.isEmpty() ? Collections.emptyList() : numbers;
    }
}
