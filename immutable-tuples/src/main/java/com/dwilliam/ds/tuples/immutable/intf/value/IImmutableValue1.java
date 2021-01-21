package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue1;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue1;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T1> the type of the first element of the tuple
 */
public interface IImmutableValue1<T extends ITuple, T1> extends IGetValue1<T1>, ISetImmutableValue1<T, T1> {}
