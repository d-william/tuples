package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable octas.
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
public interface IOcta<T1, T2, T3, T4, T5, T6, T7, T8> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5>, IGetValue6<T6>, IGetValue7<T7>, IGetValue8<T8> {

    @Override
    IOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5(), _6(), _7(), _8()};
    }

    /**
     * Creates a nonuple from the element of this octa and the specified single.
     *
     * @param single the single to append to this octa
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISingle<T9> single) {
        return append(single._1());
    }

    /**
     * Creates a decuple from the element of this octa and the specified pair.
     *
     * @param pair the pair to append to this octa
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IPair<T9, T10> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a nonuple from the element of this octa and the parameters.
     *
     * @param _9 the ninth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T9 _9);

    /**
     * Creates a decuple from the element of this octa and the parameters.
     *
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T9 _9, T10 _10);

    /*ISeptuple<T2, T3, T4, T5, T6, T7, T8> ignoreFirst();
    ISeptuple<T1, T3, T4, T5, T6, T7, T8> ignoreSecond();
    ISeptuple<T1, T2, T4, T5, T6, T7, T8> ignoreThird();
    ISeptuple<T1, T2, T3, T5, T6, T7, T8> ignoreFourth();
    ISeptuple<T1, T2, T3, T4, T6, T7, T8> ignoreFifth();
    ISeptuple<T1, T2, T3, T4, T5, T7, T8> ignoreSixth();
    ISeptuple<T1, T2, T3, T4, T5, T6, T8> ignoreSeventh();
    ISeptuple<T1, T2, T3, T4, T5, T6, T7> ignoreEighth();*/


}
