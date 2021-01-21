package com.dwilliam.ds.tuples.mutable.intf.values;

import com.dwilliam.ds.tuples.intf.value.getter.IGetValue2;
import com.dwilliam.ds.tuples.intf.value.setter.mutable.ISetMutableValue2;

/**
 * Marker interface for mutable tuples.
 *
 * @param <T2> the type of the second element of the tuple
 */
public interface IMutableValue2<T2> extends IGetValue2<T2>, ISetMutableValue2<T2> {}
