package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue3;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue3;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T3> the type of the third element of the tuple
 */
public interface IImmutableValue3<T extends ITuple, T3> extends IGetValue3<T3>, ISetImmutableValue3<T, T3> {}
