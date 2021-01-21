package com.dwilliam.ds.tuples.intf.value.setter.immutable;

import com.dwilliam.ds.tuples.intf.ITuple;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T> the type of the tuple
 * @param <T7> the type of the seventh element of the set
 */
public interface ISetImmutableValue7<T extends ITuple, T7> {

    /**
     * Sets the seventh element of the set.
     *
     * @param _7 the element to set
     * @return a new tuple from this one with the seventh element modified
     */
    T _7(T7 _7);

    /**
     * Sets the seventh element of the set.
     *
     * @param seventh the element to set
     * @return a new tuple from this one with the seventh element modified
     */
    T seventh(T7 seventh);

}
