package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable nonuples.
 *
 * @param <T1> the type of the first element of the nonuple
 * @param <T2> the type of the second element of the nonuple
 * @param <T3> the type of the third element of the nonuple
 * @param <T4> the type of the fourth element of the nonuple
 * @param <T5> the type of the fifth element of the nonuple
 * @param <T6> the type of the sixth element of the nonuple
 * @param <T7> the type of the seventh element of the nonuple
 * @param <T8> the type of the eighth element of the nonuple
 * @param <T9> the type of the ninth element of the nonuple
 */
public interface IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5>, IMutableValue6<T6>, IMutableValue7<T7>, IMutableValue8<T8>, IMutableValue9<T9> {

    @Override
    IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone();

    @Override
    default <T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISingle <T10> single) {
        return append(single._1());
    }

    @Override
    <T10> IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T10 _10);

}
