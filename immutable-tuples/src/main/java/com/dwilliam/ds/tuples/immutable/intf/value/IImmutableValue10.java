package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue10;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue10;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T10> the type of the tenth element of the tuple
 */
public interface IImmutableValue10<T extends ITuple, T10> extends IGetValue10<T10>, ISetImmutableValue10<T, T10> {}
