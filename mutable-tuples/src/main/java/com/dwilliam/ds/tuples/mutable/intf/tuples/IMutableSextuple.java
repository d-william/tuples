package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable sextuples.
 *
 * @param <T1> the type of the first element of the sextuple
 * @param <T2> the type of the second element of the sextuple
 * @param <T3> the type of the third element of the sextuple
 * @param <T4> the type of the fourth element of the sextuple
 * @param <T5> the type of the fifth element of the sextuple
 * @param <T6> the type of the sixth element of the sextuple
 */
public interface IMutableSextuple<T1, T2, T3, T4, T5, T6> extends ISextuple<T1, T2, T3, T4, T5, T6>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5>, IMutableValue6<T6> {

    @Override
    IMutableSextuple<T1, T2, T3, T4, T5, T6> clone();

    @Override
    default <T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(ISingle <T7> single) {
        return append(single._1());
    }

    @Override
    default <T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IPair <T7, T8> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    default <T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ITriple <T7, T8, T9> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    @Override
    default <T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuad <T7, T8, T9, T10> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    @Override
    <T7> IMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> append(T7 _7);

    @Override
    <T7, T8> IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T7 _7, T8 _8);

    @Override
    <T7, T8, T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T7 _7, T8 _8, T9 _9);

    @Override
    <T7, T8, T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T7 _7, T8 _8, T9 _9, T10 _10);

}
