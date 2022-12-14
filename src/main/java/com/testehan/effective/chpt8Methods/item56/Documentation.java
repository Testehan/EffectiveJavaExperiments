package com.testehan.effective.chpt8Methods.item56;

public class Documentation {

    /**
     * Returns the element at the specified position in this list.
     *
     * <p>This method is <i>not</i> guaranteed to run in constant
     * time. In some implementations it may run in time proportional
     * to the element position.
     *
     * @param index index of element to return; must be
     *       non-negative and less than the size of this list
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *           ({@code index < 0 || index >= this.size()})
     */
    public int get(int index){
        return 10; // obviously a dummy implementation
    }


    /**
     * Returns true if this collection is empty.
     *
     * @implSpec
     * This implementation returns {@code this.size() == 0}.
     *
     * @return true if this collection is empty
     */
    public boolean isEmpty() {return false; }


    /**
     * An object that maps keys to values. A map cannot contain
     * duplicate keys; each key can map to at most one value.
     *
     * (Remainder omitted)
     *
     * @param <K> the type of keys maintained by this map
     * @param <V> the type of mapped values
     */
    public interface Map<K, V> {
        //...
    }
}
