package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T2> the type of the second element of the set
 */
public interface ISetImmutableValue2<T extends ITuple, T2> {

    /**
     * Sets the second element of the set.
     *
     * @param _2 the element to set
     * @return a new tuple from this one with the second element modified
     */
    T _2(T2 _2);

    /**
     * Sets the second element of the set.
     *
     * @param second the element to set
     * @return a new tuple from this one with the second element modified
     */
    T second(T2 second);

}
