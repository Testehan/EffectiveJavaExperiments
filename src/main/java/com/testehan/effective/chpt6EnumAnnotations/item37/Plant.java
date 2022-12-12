package com.testehan.effective.chpt6EnumAnnotations.item37;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant[] garden = {
                new Plant("Basil",    LifeCycle.ANNUAL),
                new Plant("Carroway", LifeCycle.BIENNIAL),
                new Plant("Dill",     LifeCycle.ANNUAL),
                new Plant("Lavendar", LifeCycle.PERENNIAL),
                new Plant("Parsley",  LifeCycle.BIENNIAL),
                new Plant("Rosemary", LifeCycle.PERENNIAL)
        };

        // much better
        /*
            The reason that EnumMap is comparable in speed to an ordinal-indexed array is that EnumMap uses such an
            array internally, but it hides this implementation detail from the programmer,
            combining the richness and type safety of a Map with the speed of an array. Note
            that the EnumMap constructor takes the Class object of the key type: this is a
            bounded type token, which provides runtime generic type information (Item 33).
         */
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());
        for (Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        System.out.println(plantsByLifeCycle);


        // Using ordinal() to index into an array - DON'T DO THIS!  (Page 171)
//        Set<Plant>[] plantsByLifeCycleArr =
//                (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
//        for (int i = 0; i < plantsByLifeCycleArr.length; i++)
//            plantsByLifeCycleArr[i] = new HashSet<>();
//        for (Plant p : garden)
//            plantsByLifeCycleArr[p.lifeCycle.ordinal()].add(p);
//        // Print the results
//        for (int i = 0; i < plantsByLifeCycleArr.length; i++) {
//            System.out.printf("%s: %s%n",
//                    Plant.LifeCycle.values()[i], plantsByLifeCycleArr[i]);
//        }
    }
}
