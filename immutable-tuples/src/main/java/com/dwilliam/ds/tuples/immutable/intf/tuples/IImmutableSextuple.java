package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

/**
 * Marker interface for immutable sextuples.
 *
 * @param <T1> the type of the first element of the sextuple
 * @param <T2> the type of the second element of the sextuple
 * @param <T3> the type of the third element of the sextuple
 * @param <T4> the type of the fourth element of the sextuple
 * @param <T5> the type of the fifth element of the sextuple
 * @param <T6> the type of the sixth element of the sextuple
 */
public interface IImmutableSextuple<T1, T2, T3, T4, T5, T6> extends ISextuple<T1, T2, T3, T4, T5, T6>, IImmutableValue1<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T1>, IImmutableValue2<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T2>, IImmutableValue3<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T3>, IImmutableValue4<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T4>, IImmutableValue5<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T5>, IImmutableValue6<IImmutableSextuple<T1, T2, T3, T4, T5, T6>, T6> {

    @Override
    IImmutableSextuple<T1, T2, T3, T4, T5, T6> clone();

    @Override
    default <T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(ISingle <T7> single) {
        return append(single._1());
    }

    @Override
    default <T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IPair <T7, T8> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ITriple <T7, T8, T9> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuad <T7, T8, T9, T10> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    <T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T7 _7);

    @Override
    <T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T7 _7, T8 _8);

    @Override
    <T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T7 _7, T8 _8, T9 _9);

    @Override
    <T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T7 _7, T8 _8, T9 _9, T10 _10);

}
