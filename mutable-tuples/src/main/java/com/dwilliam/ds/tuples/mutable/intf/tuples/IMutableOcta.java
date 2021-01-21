package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable octas.
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
public interface IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> extends IOcta<T1, T2, T3, T4, T5, T6, T7, T8>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5>, IMutableValue6<T6>, IMutableValue7<T7>, IMutableValue8<T8> {

    @Override
    IMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone();

    @Override
    default <T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISingle <T9> single) {
        return append(single._1());
    }

    @Override
    default <T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IPair <T9, T10> pair) {
        return append(pair._1(), pair._2());
    }

    @Override
    <T9> IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T9 _9);

    @Override
    <T9, T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T9 _9, T10 _10);

}
