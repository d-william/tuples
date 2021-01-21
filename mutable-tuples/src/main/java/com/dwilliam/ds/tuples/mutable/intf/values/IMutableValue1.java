package com.dwilliam.ds.tuples.mutable.intf.values;

import com.dwilliam.ds.tuples.intf.value.getter.IGetValue1;
import com.dwilliam.ds.tuples.intf.value.setter.mutable.ISetMutableValue1;

/**
 * Marker interface for mutable tuples.
 *
 * @param <T1> the type of the first element of the tuple
 */
public interface IMutableValue1<T1> extends IGetValue1<T1>, ISetMutableValue1<T1> {}