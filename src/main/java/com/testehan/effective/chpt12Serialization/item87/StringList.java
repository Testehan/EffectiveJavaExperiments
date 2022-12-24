package com.testehan.effective.chpt12Serialization.item87;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// StringList with a reasonable custom serialized form
// A reasonable serialized form for StringList is simply the number of strings
//  in the list, followed by the strings themselves. This constitutes the logical data
//  represented by a StringList, stripped of the details of its physical representation
public final class StringList implements Serializable {
    private transient int size   = 0;       // means that it will not be part of class’s default serialized form
    private transient Entry head = null;

    // No longer Serializable!
    private static class Entry {
        String data;
        Entry  next;
        Entry  previous;
    }

    // Appends the specified string to the list
    public final void add(String s) {  }

    /**
     * Serialize this {@code StringList} instance.
     *
     * @serialData The size of the list (the number of strings
     * it contains) is emitted ({@code int}), followed by all of
     * its elements (each a {@code String}), in the proper
     * sequence.
     */
    private void writeObject(ObjectOutputStream s) throws IOException {
        //  The first thing writeObject does is to invoke defaultWriteObject, and the
        //  first thing readObject does is to invoke defaultReadObject, even though all of
        //  StringList’s fields are transient. You may hear it said that if all of a class’s
        //  instance fields are transient, you can dispense with invoking defaultWriteObject
        //  and defaultReadObject, but the serialization specification requires you to invoke
        //  them regardless.
        // The presence of these calls makes it possible to add nontransient
        //  instance fields in a later release while preserving backward and forward compatibility. If an instance is
        //  serialized in a later version and deserialized in an earlier
        //  version, the added fields will be ignored
        s.defaultWriteObject();
        s.writeInt(size);

        // Write out all elements in the proper order.
        for (Entry e = head; e != null; e = e.next)
            s.writeObject(e.data);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int numElements = s.readInt();

        // Read in all elements and insert them in list
        for (int i = 0; i < numElements; i++)
            add((String) s.readObject());
    }

    // Remainder omitted
}
