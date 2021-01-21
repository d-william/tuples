package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T3> the type of the third element of the set
 */
public interface ISetImmutableValue3<T extends ITuple, T3> {

    /**
     * Sets the third element of the set.
     *
     * @param _3 the element to set
     * @return a new tuple from this one with the third element modified
     */
    T _3(T3 _3);

    /**
     * Sets the third element of the set.
     *
     * @param third the element to set
     * @return a new tuple from this one with the third element modified
     */
    T third(T3 third);

}
