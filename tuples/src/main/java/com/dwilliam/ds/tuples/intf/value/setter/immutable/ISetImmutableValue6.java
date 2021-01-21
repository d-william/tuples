package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T6> the type of the sixth element of the set
 */
public interface ISetImmutableValue6<T extends ITuple, T6> {

    /**
     * Sets the sixth element of the set.
     *
     * @param _6 the element to set
     * @return a new tuple from this one with the sixth element modified
     */
    T _6(T6 _6);

    /**
     * Sets the sixth element of the set.
     *
     * @param sixth the element to set
     * @return a new tuple from this one with the sixth element modified
     */
    T sixth(T6 sixth);

}
