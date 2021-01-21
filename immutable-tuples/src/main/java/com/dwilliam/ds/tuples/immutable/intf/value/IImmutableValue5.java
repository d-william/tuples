package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue5;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue5;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T5> the type of the fifth element of the tuple
 */
public interface IImmutableValue5<T extends ITuple, T5> extends IGetValue5<T5>, ISetImmutableValue5<T, T5> {}
