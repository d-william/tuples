package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.IDecuple;

/**
 * Marker interface for immutable decuples.
 *
 * @param <T1> the type of the first element of the decuple
 * @param <T2> the type of the second element of the decuple
 * @param <T3> the type of the third element of the decuple
 * @param <T4> the type of the fourth element of the decuple
 * @param <T5> the type of the fifth element of the decuple
 * @param <T6> the type of the sixth element of the decuple
 * @param <T7> the type of the seventh element of the decuple
 * @param <T8> the type of the eighth element of the decuple
 * @param <T9> the type of the ninth element of the decuple
 * @param <T10> the type of the ninth element of the decuple
 */
public interface IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, IImmutableValue1<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T1>, IImmutableValue2<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T2>, IImmutableValue3<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T3>, IImmutableValue4<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T4>, IImmutableValue5<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T5>, IImmutableValue6<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T6>, IImmutableValue7<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T7>, IImmutableValue8<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T8>, IImmutableValue9<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T9>, IImmutableValue10<IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, T10> {

    @Override
    IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone();

}
