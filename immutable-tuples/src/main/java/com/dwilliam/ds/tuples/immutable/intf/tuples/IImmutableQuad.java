package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

/**
 * Marker interface for immutable quads.
 *
 * @param <T1> the type of the first element of the quad
 * @param <T2> the type of the second element of the quad
 * @param <T3> the type of the third element of the quad
 * @param <T4> the type of the fourth element of the quad
 */
public interface IImmutableQuad<T1, T2, T3, T4> extends IQuad<T1, T2, T3, T4>, IImmutableValue1<IImmutableQuad<T1, T2, T3, T4>, T1>, IImmutableValue2<IImmutableQuad<T1, T2, T3, T4>, T2>, IImmutableValue3<IImmutableQuad<T1, T2, T3, T4>, T3>, IImmutableValue4<IImmutableQuad<T1, T2, T3, T4>, T4> {

    @Override
    IImmutableQuad<T1, T2, T3, T4> clone();

    @Override
    default <T5> IImmutableQuint<T1, T2, T3, T4, T5> append(ISingle <T5> single) {
        return append(single._1());
    }

    @Override
    default <T5, T6> IImmutableSextuple<T1, T2, T3, T4, T5, T6> append(IPair <T5, T6> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T5, T6, T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(ITriple <T5, T6, T7> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T5, T6, T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IQuad <T5, T6, T7, T8> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T5, T6, T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IQuint <T5, T6, T7, T8, T9> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T5, T6, T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISextuple <T5, T6, T7, T8, T9, T10> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    <T5> IImmutableQuint<T1, T2, T3, T4, T5> append(T5 _5);

    @Override
    <T5, T6> IImmutableSextuple<T1, T2, T3, T4, T5, T6> append(T5 _5, T6 _6);

    @Override
    <T5, T6, T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T5 _5, T6 _6, T7 _7);

    @Override
    <T5, T6, T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T5, T6, T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T5, T6, T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
