package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T5> the type of the fifth element of the set
 */
public interface ISetImmutableValue5<T extends ITuple, T5> {

    /**
     * Sets the fifth element of the set.
     *
     * @param _5 the element to set
     * @return a new tuple from this one with the fifth element modified
     */
    T _5(T5 _5);

    /**
     * Sets the fifth element of the set.
     *
     * @param fifth the element to set
     * @return a new tuple from this one with the fifth element modified
     */
    T fifth(T5 fifth);

}
