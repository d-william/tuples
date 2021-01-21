package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.IOcta;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;

/**
 * Marker interface for immutable octas.
 *
 * @param <T1> the type of the first element of the octa
 * @param <T2> the type of the second element of the octa
 * @param <T3> the type of the third element of the octa
 * @param <T4> the type of the fourth element of the octa
 * @param <T5> the type of the fifth element of the octa
 * @param <T6> the type of the sixth element of the octa
 * @param <T7> the type of the seventh element of the octa
 * @param <T8> the type of the eighth element of the octa
 */
public interface IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> extends IOcta<T1, T2, T3, T4, T5, T6, T7, T8>, IImmutableValue1<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T1>, IImmutableValue2<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T2>, IImmutableValue3<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T3>, IImmutableValue4<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T4>, IImmutableValue5<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T5>, IImmutableValue6<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T6>, IImmutableValue7<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T7>, IImmutableValue8<IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, T8> {

    @Override
    IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone();

    @Override
    default <T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISingle <T9> single) {
        return append(single._1());
    }

    @Override
    default <T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IPair <T9, T10> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    <T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T9 _9);

    @Override
    <T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T9 _9, T10 _10);

}
