package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable quintuples.
 *
 * @param <T1> the type of the first element of the quintuple
 * @param <T2> the type of the second element of the quintuple
 * @param <T3> the type of the third element of the quintuple
 * @param <T4> the type of the fourth element of the quintuple
 * @param <T5> the type of the fifth element of the quintuple
 */
public interface IMutableQuint<T1, T2, T3, T4, T5> extends IQuint<T1, T2, T3, T4, T5>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5> {

    @Override
    IMutableQuint<T1, T2, T3, T4, T5> clone();

    @Override
    default <T6> IMutableSextuple<T1, T2, T3, T4, T5, T6> append(ISingle <T6> single) {
        return append(single._1());
    }

    @Override
    default <T6, T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(IPair <T6, T7> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T6, T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ITriple <T6, T7, T8> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T6, T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IQuad <T6, T7, T8, T9> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T6, T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuint <T6, T7, T8, T9, T10> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    <T6> IMutableSextuple<T1, T2, T3, T4, T5, T6> append(T6 _6);

    @Override
    <T6, T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T6 _6, T7 _7);

    @Override
    <T6, T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T6 _6, T7 _7, T8 _8);

    @Override
    <T6, T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T6, T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
