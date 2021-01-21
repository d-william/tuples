package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISeptuple;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.intf.tuples.ITriple;

/**
 * Marker interface for immutable septuples.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public interface IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> extends ISeptuple<T1, T2, T3, T4, T5, T6, T7>, IImmutableValue1<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T1>, IImmutableValue2<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T2>, IImmutableValue3<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T3>, IImmutableValue4<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T4>, IImmutableValue5<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T5>, IImmutableValue6<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T6>, IImmutableValue7<IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7>, T7> {

    @Override
    IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> clone();

    @Override
    default <T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISingle <T8> single) {
        return append(single._1());
    }

    @Override
    default <T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IPair <T8, T9> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ITriple <T8, T9, T10> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    <T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T8 _8);

    @Override
    <T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T8 _8, T9 _9);

    @Override
    <T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T8 _8, T9 _9, T10 _10);

}
