package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T4> the type of the fourth element of the set
 */
public interface ISetImmutableValue4<T extends ITuple, T4> {

    /**
     * Sets the fourth element of the set.
     *
     * @param _4 the element to set
     * @return a new tuple from this one with the fourth element modified
     */
    T _4(T4 _4);

    /**
     * Sets the fourth element of the set.
     *
     * @param fourth the element to set
     * @return a new tuple from this one with the fourth element modified
     */
    T fourth(T4 fourth);

}
