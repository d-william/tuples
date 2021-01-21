package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.*;

/**
 * Marker interface serializable sextuples.
 *
 * @param <T1> the type of the first element of the sextuple
 * @param <T2> the type of the second element of the sextuple
 * @param <T3> the type of the third element of the sextuple
 * @param <T4> the type of the fourth element of the sextuple
 * @param <T5> the type of the fifth element of the sextuple
 * @param <T6> the type of the sixth element of the sextuple
 */
public interface ISextuple<T1, T2, T3, T4, T5, T6> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3>, IGetValue4<T4>, IGetValue5<T5>, IGetValue6<T6> {

    @Override
    ISextuple<T1, T2, T3, T4, T5, T6> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3(), _4(), _5(), _6()};
    }

    /**
     * Creates a septuple from the element of this sextuple and the specified single.
     *
     * @param single the single to append to this sextuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    default <T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(ISingle<T7> single) {
        return append(single._1());
    }

    /**
     * Creates a octa from the element of this sextuple and the specified pair.
     *
     * @param pair the pair to append to this sextuple
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IPair<T7, T8> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a nonuple from the element of this sextuple and the specified triple.
     *
     * @param triple the triple to append to this sextuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ITriple<T7, T8, T9> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a decuple from the element of this sextuple and the specified quad.
     *
     * @param quad the quad to append to this sextuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IQuad<T7, T8, T9, T10> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a septuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    <T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(T7 _7);

    /**
     * Creates a octa from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T7 _7, T8 _8);

    /**
     * Creates a nonuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T7 _7, T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T7 _7, T8 _8, T9 _9, T10 _10);

    /*IQuint<T2, T3, T4, T5, T6> ignoreFirst();
    IQuint<T1, T3, T4, T5, T6> ignoreSecond();
    IQuint<T1, T2, T4, T5, T6> ignoreThird();
    IQuint<T1, T2, T3, T5, T6> ignoreFourth();
    IQuint<T1, T2, T3, T4, T6> ignoreFifth();
    IQuint<T1, T2, T3, T4, T5> ignoreSixth();*/


}
