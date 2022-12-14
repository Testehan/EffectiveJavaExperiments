package com.testehan.effective.chpt8Methods.item50;

import java.util.Date;

// broken immutable Period  class
public class Period {
    private final Date start;
    private final Date end;

    /**
     * @param  start the beginning of the period
     * @param  end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period(Date start, Date end) {       // defensive copies are made for these 2 params also, because of the same
        if (start.compareTo(end) > 0)           // reason as for the getters from below
            throw new IllegalArgumentException(
                    start + " after " + end);
        this.start = start;
        this.end   = end;
    }

    public Date start() {
        return start;           // because we return the date field, the value of it will be modifiable from outside
    }                           // see in the commented code how we should protect ourselves in this case
    public Date end() {
        return end;              // because we return the date field, the value of it will be modifiable from outside
    }                            // see in the commented code how we should protect ourselves in this case

    public String toString() {
        return start + " - " + end;
    }

//    // Repaired constructor - makes defensive copies of parameters (Page 232)
//    public Period(Date start, Date end) {
//        this.start = new Date(start.getTime());
//        this.end   = new Date(end.getTime());
//
//        if (this.start.compareTo(this.end) > 0)
//            throw new IllegalArgumentException(
//                    this.start + " after " + this.end);
//    }
//
//    // Repaired accessors - make defensive copies of internal fields (Page 233)
//    public Date start() {
//        return new Date(start.getTime());
//    }
//
//    public Date end() {
//        return new Date(end.getTime());
//    }

    // Remainder omitted
}
