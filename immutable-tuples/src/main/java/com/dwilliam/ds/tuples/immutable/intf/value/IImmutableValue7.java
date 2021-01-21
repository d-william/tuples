package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue7;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue7;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T7> the type of the seventh element of the tuple
 */
public interface IImmutableValue7<T extends ITuple, T7> extends IGetValue7<T7>, ISetImmutableValue7<T, T7> {}
