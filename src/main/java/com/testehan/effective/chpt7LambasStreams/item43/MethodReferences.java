package com.testehan.effective.chpt7LambasStreams.item43;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.*;

public class MethodReferences {

    public static void main(String[] args) throws InterruptedException {

        // method reference type : Static
        action(Integer::parseInt);

        //method reference type : Bound
        Predicate<Instant> predicate = Instant.now()::isBefore;
        Thread.sleep(4000);
        check(predicate);
        
        // method reference type : Unbound 
        action2(String::toLowerCase);

        // method reference type : Class Constructor
        Supplier<Map<String,Integer>> mapCreator=  TreeMap::new;
        Map<String,Integer> map = mapCreator.get();

        // method reference type : Array Constructor
        List<Integer> integers = List.of(1,2,56,34);
        IntFunction<int[]> arrayCreator = int[]::new;
        for (int i: integers) {
            int[] someArray = arrayCreator.apply(i);
            System.out.println(someArray);
        }

    }

    private static void action2(UnaryOperator<String> operation) {
        List<String> strings = List.of("ABCdef","HGKSKE");
        for (String s: strings) {
            System.out.println(operation.apply(s));
        }

    }

    private static void check(Predicate<Instant> predicate) {
        List<Instant> instants = List.of(Instant.now(),Instant.now(),Instant.now());
        for (Instant i : instants){
            if (predicate.test(i)){
                System.out.println("Predicate object is before current instant i");
            } else {
                System.out.println("Predicate object is after current instant i");
            }
        }
    }

    private static void action(Function<String, Integer> function){
        List<String> strings = List.of("1","2","56","342");
        Integer sum = 0;
        for (String s: strings) {
            sum = sum + function.apply(s);
        }
        System.out.println(sum);
    }
}
