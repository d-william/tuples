package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue2;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue2;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T2> the type of the second element of the tuple
 */
public interface IImmutableValue2<T extends ITuple, T2> extends IGetValue2<T2>, ISetImmutableValue2<T, T2> {}
