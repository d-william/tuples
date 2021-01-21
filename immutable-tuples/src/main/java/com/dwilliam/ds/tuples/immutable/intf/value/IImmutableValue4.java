package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue4;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue4;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T4> the type of the fourth element of the tuple
 */
public interface IImmutableValue4<T extends ITuple, T4> extends IGetValue4<T4>, ISetImmutableValue4<T, T4> {}
