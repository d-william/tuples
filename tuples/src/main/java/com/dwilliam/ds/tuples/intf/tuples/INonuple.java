package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable nonuples.
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
public interface INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5>, IGetValue6<T6>, IGetValue7<T7>, IGetValue8<T8>, IGetValue9<T9> {

    @Override
    INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5(), _6(), _7(), _8(), _9()};
    }

    /**
     * Creates a decuple from the element of this nonuple and the single in parameters.
     *
     * @param single the single that contains the elements with which the decuple will be constructed
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISingle<T10> single) {
        return append(single._1());
    }

    /**
     * Creates a decuple from the element of this nonuple and the parameters.
     *
     * @param _10 the tenth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T10 _10);

    /*IOcta<T2, T3, T4, T5, T6, T7, T8, T9> ignoreFirst();
    IOcta<T1, T3, T4, T5, T6, T7, T8, T9> ignoreSecond();
    IOcta<T1, T2, T4, T5, T6, T7, T8, T9> ignoreThird();
    IOcta<T1, T2, T3, T5, T6, T7, T8, T9> ignoreFourth();
    IOcta<T1, T2, T3, T4, T6, T7, T8, T9> ignoreFifth();
    IOcta<T1, T2, T3, T4, T5, T7, T8, T9> ignoreSixth();
    IOcta<T1, T2, T3, T4, T5, T6, T8, T9> ignoreSeventh();
    IOcta<T1, T2, T3, T4, T5, T6, T7, T9> ignoreEighth();
    IOcta<T1, T2, T3, T4, T5, T6, T7, T8> ignoreNinth();*/


}
