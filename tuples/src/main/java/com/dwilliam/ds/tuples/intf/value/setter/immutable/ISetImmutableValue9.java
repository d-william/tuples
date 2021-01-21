package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T9> the type of the ninth element of the set
 */
public interface ISetImmutableValue9<T extends ITuple, T9> {

    /**
     * Sets the ninth element of the set.
     *
     * @param _9 the element to set
     * @return a new tuple from this one with the ninth element modified
     */
    T _9(T9 _9);

    /**
     * Sets the ninth element of the set.
     *
     * @param ninth the element to set
     * @return a new tuple from this one with the ninth element modified
     */
    T ninth(T9 ninth);

}
