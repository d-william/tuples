package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T1> the type of the first element of the set
 */
public interface ISetImmutableValue1<T extends ITuple, T1> {

    /**
     * Sets the first element of the set.
     *
     * @param _1 the element to set
     * @return a new tuple from this one with the first element modified
     */
    T _1(T1 _1);

    /**
     * Sets the first element of the set.
     *
     * @param first the element to set
     * @return a new tuple from this one with the first element modified
     */
    T first(T1 first);

}
