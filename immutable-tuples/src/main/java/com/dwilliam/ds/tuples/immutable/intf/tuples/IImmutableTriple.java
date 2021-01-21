package com.dwilliam.ds.tuples.immutable.intf.tuples;

import com.dwilliam.ds.tuples.immutable.intf.value.*;
import com.dwilliam.ds.tuples.intf.tuples.*;

/**
 * Marker interface for immutable quads.
 *
 * @param <T1> the type of the first element of the quad
 * @param <T2> the type of the second element of the quad
 * @param <T3> the type of the third element of the quad
 */
public interface IImmutableTriple<T1, T2, T3> extends ITriple<T1, T2, T3>, IImmutableValue1<IImmutableTriple<T1, T2, T3>, T1>, IImmutableValue2<IImmutableTriple<T1, T2, T3>, T2>, IImmutableValue3<IImmutableTriple<T1, T2, T3>, T3> {

    @Override
    IImmutableTriple<T1, T2, T3> clone();

    @Override
    default <T4> IImmutableQuad<T1, T2, T3, T4> append(ISingle <T4> single) {
        return append(single._1());
    }

    @Override
    default <T4, T5> IImmutableQuint<T1, T2, T3, T4, T5> append(IPair <T4, T5> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T4, T5, T6> IImmutableSextuple<T1, T2, T3, T4, T5, T6> append(ITriple <T4, T5, T6> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T4, T5, T6, T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(IQuad <T4, T5, T6, T7> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T4, T5, T6, T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IQuint <T4, T5, T6, T7, T8> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T4, T5, T6, T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISextuple <T4, T5, T6, T7, T8, T9> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    default <T4, T5, T6, T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISeptuple <T4, T5, T6, T7, T8, T9, T10> septuple) {
        return append(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    <T4> IImmutableQuad<T1, T2, T3, T4> append(T4 _4);

    @Override
    <T4, T5> IImmutableQuint<T1, T2, T3, T4, T5> append(T4 _4, T5 _5);

    @Override
    <T4, T5, T6> IImmutableSextuple<T1, T2, T3, T4, T5, T6> append(T4 _4, T5 _5, T6 _6);

    @Override
    <T4, T5, T6, T7> IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T4 _4, T5 _5, T6 _6, T7 _7);

    @Override
    <T4, T5, T6, T7, T8> IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T4, T5, T6, T7, T8, T9> IImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T4, T5, T6, T7, T8, T9, T10> IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
