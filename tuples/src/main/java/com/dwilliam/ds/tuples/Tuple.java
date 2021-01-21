package com.dwilliam.ds.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;

import java.util.*;

public abstract class Tuple implements ITuple {

    /**
     * Indicates whether some other object is "equal to" this tuple.
     * More formally, returns {@code true} if and only if the specified
     * object implements the same interface as this tuple and if all
     * elements in both tuple are equals in order.
     *
     * @param tuple the reference object with which to compare.
     * @return {@code true} if this object is "equal to" the object
     *         argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object tuple) {
        if (this == tuple) return true;
        if (tuple == null) return false;
        if (tuple instanceof ITuple) return Arrays.equals(toArray(), ((ITuple) tuple).toArray()); // TODO instanceof ITuple or instanceof Tuple ?
        return false;
    }

    @Override
    public abstract Tuple clone();

    @Override
    public int hashCode() {
        return Arrays.hashCode(toArray());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + Arrays.toString(toArray());
    }

}
