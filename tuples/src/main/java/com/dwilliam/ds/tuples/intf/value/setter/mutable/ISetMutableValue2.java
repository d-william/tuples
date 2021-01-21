package com.dwilliam.ds.tuples.intf.value.setter.mutable;

/**
 * Marker interface for mutable tuples.
 *
 * @param <T2> the type of the second element of the tuple
 */
public interface ISetMutableValue2<T2> {

    /**
     * Sets the second element of the tuple.
     *
     * @param _2 the element to set
     */
    void _2(T2 _2);

    /**
     * Sets the second element of the tuple.
     *
     * @param second the element to set
     */
    void second(T2 second);

}
