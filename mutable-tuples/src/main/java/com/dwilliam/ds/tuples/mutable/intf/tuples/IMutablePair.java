package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable pairs.
 *
 * @param <T1> the type of the first element of the pair
 * @param <T2> the type of the second element of the pair
 */
public interface IMutablePair<T1, T2> extends IPair<T1, T2>, IMutableValue1<T1>, IMutableValue2<T2> {

    @Override
    IMutablePair<T1, T2> clone();

    @Override
    default <T3> IMutableTriple<T1, T2, T3> append(ISingle <T3> single) {
        return append(single._1());
    }

    @Override
    default <T3, T4> IMutableQuad<T1, T2, T3, T4> append(IPair <T3, T4> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T3, T4, T5> IMutableQuint<T1, T2, T3, T4, T5> append(ITriple <T3, T4, T5> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T3, T4, T5, T6> IMutableSextuple<T1, T2, T3, T4, T5, T6> append(IQuad <T3, T4, T5, T6> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T3, T4, T5, T6, T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(IQuint <T3, T4, T5, T6, T7> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T3, T4, T5, T6, T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISextuple <T3, T4, T5, T6, T7, T8> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    default <T3, T4, T5, T6, T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISeptuple <T3, T4, T5, T6, T7, T8, T9> septuple) {
        return append(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    default <T3, T4, T5, T6, T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IOcta <T3, T4, T5, T6, T7, T8, T9, T10> octa) {
        return append(octa._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    @Override
    <T3> IMutableTriple<T1, T2, T3> append(T3 _3);

    @Override
    <T3, T4> IMutableQuad<T1, T2, T3, T4> append(T3 _3, T4 _4);

    @Override
    <T3, T4, T5> IMutableQuint<T1, T2, T3, T4, T5> append(T3 _3, T4 _4, T5 _5);

    @Override
    <T3, T4, T5, T6> IMutableSextuple<T1, T2, T3, T4, T5, T6> append(T3 _3, T4 _4, T5 _5, T6 _6);

    @Override
    <T3, T4, T5, T6, T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7);

    @Override
    <T3, T4, T5, T6, T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T3, T4, T5, T6, T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T3, T4, T5, T6, T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
