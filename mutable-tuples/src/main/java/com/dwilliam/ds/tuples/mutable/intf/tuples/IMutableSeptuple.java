package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable septuples.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public interface IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> extends ISeptuple<T1, T2, T3, T4, T5, T6, T7>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5>, IMutableValue6<T6>, IMutableValue7<T7> {

    @Override
    IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> clone();

    @Override
    default <T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISingle <T8> single) {
        return append(single._1());
    }

    @Override
    default <T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IPair <T8, T9> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ITriple <T8, T9, T10> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    <T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T8 _8);

    @Override
    <T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T8 _8, T9 _9);

    @Override
    <T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T8 _8, T9 _9, T10 _10);

}
