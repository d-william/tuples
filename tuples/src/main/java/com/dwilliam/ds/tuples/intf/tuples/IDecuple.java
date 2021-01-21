package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable decuples.
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
public interface IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5>, IGetValue6<T6>, IGetValue7<T7>, IGetValue8<T8>, IGetValue9<T9>, IGetValue10<T10> {

    @Override
    IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5(), _6(), _7(), _8(), _9(), _10()};
    }

    /*INonuple<T2, T3, T4, T5, T6, T7, T8, T9, T10> ignoreFirst();
    INonuple<T1, T3, T4, T5, T6, T7, T8, T9, T10> ignoreSecond();
    INonuple<T1, T2, T4, T5, T6, T7, T8, T9, T10> ignoreThird();
    INonuple<T1, T2, T3, T5, T6, T7, T8, T9, T10> ignoreFourth();
    INonuple<T1, T2, T3, T4, T6, T7, T8, T9, T10> ignoreFifth();
    INonuple<T1, T2, T3, T4, T5, T7, T8, T9, T10> ignoreSixth();
    INonuple<T1, T2, T3, T4, T5, T6, T8, T9, T10> ignoreSeventh();
    INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T10> ignoreEighth();
    INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T10> ignoreNinth();
    INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> ignoreTenth();*/


}
