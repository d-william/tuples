package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue8;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue8;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T8> the type of the eighth element of the tuple
 */
public interface IImmutableValue8<T extends ITuple, T8> extends IGetValue8<T8>, ISetImmutableValue8<T, T8> {}
