package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable septuples.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public interface ISeptuple<T1, T2, T3, T4, T5, T6, T7> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5>, IGetValue6<T6>, IGetValue7<T7> {

    @Override
    ISeptuple<T1, T2, T3, T4, T5, T6, T7> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5(), _6(), _7()};
    }

    /**
     * Creates a octa from the element of this septuple and the single in parameters.
     *
     * @param single the single that contains the elements with which the octa will be constructed
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISingle<T8> single) {
        return append(single._1());
    }

    /**
     * Creates a nonuple from the element of this septuple and the pair in parameters.
     *
     * @param pair the pair that contains the elements with which the nonuple will be constructed
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IPair<T8, T9> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a decuple from the element of this septuple and the triple in parameters.
     *
     * @param triple the triple that contains the elements with which the decuple will be constructed
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ITriple<T8, T9, T10> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a octa from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T8 _8);

    /**
     * Creates a nonuple from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T8 _8, T9 _9, T10 _10);

    /*ISextuple<T2, T3, T4, T5, T6, T7> ignoreFirst();
    ISextuple<T1, T3, T4, T5, T6, T7> ignoreSecond();
    ISextuple<T1, T2, T4, T5, T6, T7> ignoreThird();
    ISextuple<T1, T2, T3, T5, T6, T7> ignoreFourth();
    ISextuple<T1, T2, T3, T4, T6, T7> ignoreFifth();
    ISextuple<T1, T2, T3, T4, T5, T7> ignoreSixth();
    ISextuple<T1, T2, T3, T4, T5, T6> ignoreSeventh();*/


}
