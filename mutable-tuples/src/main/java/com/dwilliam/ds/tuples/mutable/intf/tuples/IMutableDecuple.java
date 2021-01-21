package com.dwilliam.ds.tuples.mutable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.values.*;

/**
 * Marker interface for mutable decuples.
 *
 * @param <T1> the type of the first element of the decuple
 * @param <T2> the type of the second element of the decuple
 * @param <T3> the type of the third element of the decuple
 * @param <T4> the type of the fourth element of the decuple
 * @param <T5> the type of the fifth element of the decuple
 * @param <T6> the type of the sixth element of the decuple
 * @param <T7> the type of the seventh element of the decuple
 * @param <T8> the type of the eighth element of the decuple
 * @param <T9> the type of the ninth element of the decuple
 * @param <T10> the type of the ninth element of the decuple
 */
public interface IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, IMutableValue1<T1>, IMutableValue2<T2>, IMutableValue3<T3>, IMutableValue4<T4>, IMutableValue5<T5>, IMutableValue6<T6>, IMutableValue7<T7>, IMutableValue8<T8>, IMutableValue9<T9>, IMutableValue10<T10> {

    @Override
    IMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone();

}
