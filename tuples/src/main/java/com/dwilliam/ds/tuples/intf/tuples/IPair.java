package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue1;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue2;

/**
 * Marker interface serializable pairs.
 *
 * @param <T1> the type of the first element of the pair
 * @param <T2> the type of the second element of the pair
 */
public interface IPair<T1, T2> extends ITuple, IGetValue1<T1>, IGetValue2<T2> {

    @Override
    IPair<T1, T2> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2()};
    }

    /**
     * Creates a triple from the element of this pair and the single in parameters.
     *
     * @param single the single that contains the elements with which the triple will be constructed
     * @param <T3> the type of the third element of the triple
     * @return a {@code ITriple}
     */
    default <T3> ITriple<T1, T2, T3> append(ISingle<T3> single) {
        return append(single._1());
    }

    /**
     * Creates a quad from the element of this pair and the pair in parameters.
     *
     * @param pair the pair that contains the elements with which the quad will be constructed
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    default <T3, T4> IQuad<T1, T2, T3, T4> append(IPair<T3, T4> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a quint from the element of this pair and the triple in parameters.
     *
     * @param triple the triple that contains the elements with which the quint will be constructed
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    default <T3, T4, T5> IQuint<T1, T2, T3, T4, T5> append(ITriple<T3, T4, T5> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a sextuple from the element of this pair and the quad in parameters.
     *
     * @param quad the quad that contains the elements with which the sextuple will be constructed
     * @param <T3> the type of the third element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    default <T3, T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(IQuad<T3, T4, T5, T6> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a septuple from the element of this pair and the quint in parameters.
     *
     * @param quint the quint that contains the elements with which the septuple will be constructed
     * @param <T3> the type of the third element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    default <T3, T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(IQuint<T3, T4, T5, T6, T7> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a octa from the element of this pair and the sextuple in parameters.
     *
     * @param sextuple the sextuple that contains the elements with which the octa will be constructed
     * @param <T3> the type of the third element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T3, T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISextuple<T3, T4, T5, T6, T7, T8> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    /**
     * Creates a nonuple from the element of this pair and the septuple in parameters.
     *
     * @param septuple the septuple that contains the elements with which the nonuple will be constructed
     * @param <T3> the type of the third element of the nonuple
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T3, T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISeptuple<T3, T4, T5, T6, T7, T8, T9> septuple) {
        return append(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    /**
     * Creates a decuple from the element of this pair and the octa in parameters.
     *
     * @param octa the octa that contains the elements with which the decuple will be constructed
     * @param <T3> the type of the third element of the decuple
     * @param <T4> the type of the fourth element of the decuple
     * @param <T5> the type of the fifth element of the decuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T3, T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(IOcta<T3, T4, T5, T6, T7, T8, T9, T10> octa) {
        return append(octa._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    /**
     * Creates a triple from the element of this pair and the parameters.
     *
     * @param _3 the third element of the triple
     * @param <T3> the type of the third element of the triple
     * @return a {@code ITriple}
     */
    <T3> ITriple<T1, T2, T3> append(T3 _3);

    /**
     * Creates a quad from the element of this pair and the parameters.
     *
     * @param _3 the third element of the quad
     * @param _4 the fourth element of the quad
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    <T3, T4> IQuad<T1, T2, T3, T4> append(T3 _3, T4 _4);

    /**
     * Creates a quint from the element of this pair and the parameters.
     *
     * @param _3 the third element of the quint
     * @param _4 the fourth element of the quint
     * @param _5 the fifth element of the quint
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    <T3, T4, T5> IQuint<T1, T2, T3, T4, T5> append(T3 _3, T4 _4, T5 _5);

    /**
     * Creates a sextuple from the element of this pair and the parameters.
     *
     * @param _3 the third element of the sextuple
     * @param _4 the fourth element of the sextuple
     * @param _5 the fifth element of the sextuple
     * @param _6 the sixth element of the sextuple
     * @param <T3> the type of the third element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    <T3, T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(T3 _3, T4 _4, T5 _5, T6 _6);

    /**
     * Creates a septuple from the element of this pair and the parameters.
     *
     * @param _3 the third element of the septuple
     * @param _4 the fourth element of the septuple
     * @param _5 the fifth element of the septuple
     * @param _6 the sixth element of the septuple
     * @param _7 the seventh element of the septuple
     * @param <T3> the type of the third element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    <T3, T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7);

    /**
     * Creates a octa from the element of this pair and the parameters.
     *
     * @param _3 the third element of the octa
     * @param _4 the fourth element of the octa
     * @param _5 the fifth element of the octa
     * @param _6 the sixth element of the octa
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T3> the type of the third element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T3, T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    /**
     * Creates a nonuple from the element of this pair and the parameters.
     *
     * @param _3 the third element of the nonuple
     * @param _4 the fourth element of the nonuple
     * @param _5 the fifth element of the nonuple
     * @param _6 the sixth element of the nonuple
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T3> the type of the third element of the nonuple
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T3, T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this pair and the parameters.
     *
     * @param _3 the third element of the decuple
     * @param _4 the fourth element of the decuple
     * @param _5 the fifth element of the decuple
     * @param _6 the sixth element of the decuple
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T3> the type of the third element of the decuple
     * @param <T4> the type of the fourth element of the decuple
     * @param <T5> the type of the fifth element of the decuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T3, T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

    /*ISingle<T2> ignoreFirst();

    ISingle<T1> ignoreSecond();*/

}
