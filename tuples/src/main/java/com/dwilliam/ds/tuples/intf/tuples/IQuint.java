package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable quintuples.
 *
 * @param <T1> the type of the first element of the quintuple
 * @param <T2> the type of the second element of the quintuple
 * @param <T3> the type of the third element of the quintuple
 * @param <T4> the type of the fourth element of the quintuple
 * @param <T5> the type of the fifth element of the quintuple
 */
public interface IQuint<T1, T2, T3, T4, T5> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5> {

    @Override
    IQuint<T1, T2, T3, T4, T5> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5()};
    }

    /**
     * Creates a sextuple from the element of this quintuple and the single in parameters.
     *
     * @param single the single that contains the elements with which the sextuple will be constructed
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    default <T6> ISextuple<T1, T2, T3, T4, T5, T6> append(ISingle<T6> single) {
        return append(single._1());
    }

    /**
     * Creates a septuple from the element of this quintuple and the pair in parameters.
     *
     * @param pair the pair that contains the elements with which the septuple will be constructed
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    default <T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(IPair<T6, T7> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a octa from the element of this quintuple and the triple in parameters.
     *
     * @param triple the triple that contains the elements with which the octa will be constructed
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ITriple<T6, T7, T8> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a nonuple from the element of this quintuple and the quad in parameters.
     *
     * @param quad the quad that contains the elements with which the nonuple will be constructed
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IQuad<T6, T7, T8, T9> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a decuple from the element of this quintuple and the quint in parameters.
     *
     * @param quint the quint that contains the elements with which the decuple will be constructed
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuint<T6, T7, T8, T9, T10> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a sextuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    <T6> ISextuple<T1, T2, T3, T4, T5, T6> append(T6 _6);

    /**
     * Creates a septuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the septuple
     * @param _7 the seventh element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    <T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(T6 _6, T7 _7);

    /**
     * Creates a octa from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the octa
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T6 _6, T7 _7, T8 _8);

    /**
     * Creates a nonuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the nonuple
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the decuple
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

    /*IQuad<T2, T3, T4, T5> ignoreFirst();
    IQuad<T1, T3, T4, T5> ignoreSecond();
    IQuad<T1, T2, T4, T5> ignoreThird();
    IQuad<T1, T2, T3, T5> ignoreFourth();
    IQuad<T1, T2, T3, T4> ignoreFifth();*/


}
