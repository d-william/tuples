package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.INonuple;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;

/**
 * Marker interface for immutable nonuples.
 *
 * @param <T1> the type of the first element of the nonuple
 * @param <T2> the type of the second element of the nonuple
 * @param <T3> the type of the third element of the nonuple
 * @param <T4> the type of the fourth element of the nonuple
 * @param <T5> the type of the fifth element of the nonuple
 * @param <T6> the type of the sixth element of the nonuple
 * @param <T7> the type of the seventh element of the nonuple
 * @param <T8> the type of the eighth element of the nonuple
 * @param <T9> the type of the ninth element of the nonuple
 */
public interface IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, IImmutableValue1<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T1>, IImmutableValue2<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T2>, IImmutableValue3<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T3>, IImmutableValue4<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T4>, IImmutableValue5<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T5>, IImmutableValue6<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T6>, IImmutableValue7<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T7>, IImmutableValue8<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T8>, IImmutableValue9<IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, T9> {

    @Override
    IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone();

    @Override
    default <T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISingle <T10> single) {
        return append(single._1());
    }

    @Override
    <T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T10 _10);

}
