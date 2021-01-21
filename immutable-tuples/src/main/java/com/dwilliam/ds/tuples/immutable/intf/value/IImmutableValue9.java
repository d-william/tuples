package com.dwilliam.ds.tuples.immutable.intf.value;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.setter.immutable.ISetImmutableValue9;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue9;

/**
 * Marker interface for immutable tuples.
 *
 * @param <T9> the type of the ninth element of the tuple
 */
public interface IImmutableValue9<T extends ITuple, T9> extends IGetValue9<T9>, ISetImmutableValue9<T, T9> {}
