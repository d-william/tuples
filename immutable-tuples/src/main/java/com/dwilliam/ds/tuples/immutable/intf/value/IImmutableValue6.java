package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue6;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue6;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T6> the type of the sixth element of the tuple
 */
public interface IImmutableValue6<T extends ITuple, T6> extends IGetValue6<T6>, ISetImmutableValue6<T, T6> {}
