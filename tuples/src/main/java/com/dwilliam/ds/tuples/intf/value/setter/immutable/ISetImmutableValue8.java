package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T8> the type of the eighth element of the set
 */
public interface ISetImmutableValue8<T extends ITuple, T8> {

    /**
     * Sets the eighth element of the set.
     *
     * @param _8 the element to set
     * @return a new tuple from this one with the eighth element modified
     */
    T _8(T8 _8);

    /**
     * Sets the eighth element of the set.
     *
     * @param eighth the element to set
     * @return a new tuple from this one with the eighth element modified
     */
    T eighth(T8 eighth);

}
