package com.testehan.effective.chpt12Serialization.item90;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public final class Period implements Serializable {
    private final Date start;
    private final Date end;

    /**
     * @param  start the beginning of the period
     * @param  end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end   = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
    }

    public Date start () { return new Date(start.getTime()); }

    public Date end () { return new Date(end.getTime()); }

    public String toString() { return start + " - " + end; }


    // Serialization proxy for Period class
    private static class SerializationProxy implements Serializable {
        private final Date start;
        private final Date end;

        SerializationProxy(Period p) {
            this.start = p.start;
            this.end = p.end;
        }

        private static final long serialVersionUID = 234098243823485285L; // Any number will do (Item 87)

        // readResolve method for Period.SerializationProxy
        // Finally, provide a readResolve method on the SerializationProxy class
        // that returns a logically equivalent instance of the enclosing class. The presence of
        // this method causes the serialization system to translate the serialization proxy back
        // into an instance of the enclosing class upon deserialization
        // This readResolve method creates an instance of the enclosing class using
        // only its public API and therein lies the beauty of the pattern. It largely eliminates
        // the extralinguistic character of serialization, because the deserialized instance is
        // created using the same constructors, static factories, and methods as any other
        // instance. This frees you from having to separately ensure that deserialized
        // instances obey the class’s invariants.
        private Object readResolve() {
            return new Period(start, end); // Uses public constructor
        }
    }

    // writeReplace method for the serialization proxy pattern
    // The presence of this method on the enclosing class causes the serialization system
    //  to emit a SerializationProxy instance instead of an instance of the enclosing
    //  class. In other words, the writeReplace method translates an instance of the
    //  enclosing class to its serialization proxy prior to serialization.
    private Object writeReplace() {
        return new SerializationProxy(this);
    }

    // readObject method for the serialization proxy pattern
    // With this writeReplace method in place, the serialization system will never
    // generate a serialized instance of the enclosing class, but an attacker might
    // fabricate one in an attempt to violate the class’s invariants. To guarantee that such
    // an attack would fail, merely add this readObject method to the enclosing class
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
}
