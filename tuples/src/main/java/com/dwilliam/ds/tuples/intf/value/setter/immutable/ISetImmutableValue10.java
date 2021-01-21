package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T10> the type of the tenth element of the set
 */
public interface ISetImmutableValue10<T extends ITuple, T10> {

    /**
     * Sets the tenth element of the set.
     *
     * @param _10 the element to set
     * @return a new tuple from this one with the tenth element modified
     */
    T _10(T10 _10);

    /**
     * Sets the tenth element of the set.
     *
     * @param tenth the element to set
     * @return a new tuple from this one with the tenth element modified
     */
    T tenth(T10 tenth);

}
