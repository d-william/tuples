package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue1;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue2;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue3;

/**
 * Marker interface serializable triples.
 *
 * @param <T1> the type of the first element of the triple
 * @param <T2> the type of the second element of the triple
 * @param <T3> the type of the third element of the triple
 */
public interface ITriple<T1, T2, T3> extends ITuple, IGetValue1<T1>, IGetValue2<T2>, IGetValue3<T3> {

    @Override
    ITriple<T1, T2, T3> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1(), _2(), _3()};
    }

    /**
     * Creates a quad from the element of this triple and the single in parameters.
     *
     * @param single the single that contains the elements with which the quad will be constructed
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    default <T4> IQuad<T1, T2, T3, T4> append(ISingle<T4> single) {
        return append(single._1());
    }

    /**
     * Creates a quint from the element of this triple and the pair in parameters.
     *
     * @param pair the pair that contains the elements with which the quint will be constructed
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    default <T4, T5> IQuint<T1, T2, T3, T4, T5> append(IPair<T4, T5> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a sextuple from the element of this triple and the triple in parameters.
     *
     * @param triple the triple that contains the elements with which the sextuple will be constructed
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    default <T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(ITriple<T4, T5, T6> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a septuple from the element of this triple and the quad in parameters.
     *
     * @param quad the quad that contains the elements with which the septuple will be constructed
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    default <T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(IQuad<T4, T5, T6, T7> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a octa from the element of this triple and the quint in parameters.
     *
     * @param quint the quint that contains the elements with which the octa will be constructed
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(IQuint<T4, T5, T6, T7, T8> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a nonuple from the element of this triple and the sextuple in parameters.
     *
     * @param sextuple the sextuple that contains the elements with which the nonuple will be constructed
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(ISextuple<T4, T5, T6, T7, T8, T9> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    /**
     * Creates a decuple from the element of this triple and the septuple in parameters.
     *
     * @param septuple the septuple that contains the elements with which the decuple will be constructed
     * @param <T4> the type of the fourth element of the decuple
     * @param <T5> the type of the fifth element of the decuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    default <T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(ISeptuple<T4, T5, T6, T7, T8, T9, T10> septuple) {
        return append(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    /**
     * Creates a quad from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    <T4> IQuad<T1, T2, T3, T4> append(T4 _4);

    /**
     * Creates a quint from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the quint
     * @param _5 the fifth element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    <T4, T5> IQuint<T1, T2, T3, T4, T5> append(T4 _4, T5 _5);

    /**
     * Creates a sextuple from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the sextuple
     * @param _5 the fifth element of the sextuple
     * @param _6 the sixth element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    <T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(T4 _4, T5 _5, T6 _6);

    /**
     * Creates a septuple from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the septuple
     * @param _5 the fifth element of the septuple
     * @param _6 the sixth element of the septuple
     * @param _7 the seventh element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    <T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(T4 _4, T5 _5, T6 _6, T7 _7);

    /**
     * Creates a octa from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the octa
     * @param _5 the fifth element of the octa
     * @param _6 the sixth element of the octa
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    /**
     * Creates a nonuple from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the nonuple
     * @param _5 the fifth element of the nonuple
     * @param _6 the sixth element of the nonuple
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this triple and the parameters.
     *
     * @param _4 the fourth element of the decuple
     * @param _5 the fifth element of the decuple
     * @param _6 the sixth element of the decuple
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T4> the type of the fourth element of the decuple
     * @param <T5> the type of the fifth element of the decuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code IDecuple}
     */
    <T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

    /*IPair<T2, T3> ignoreFirst();

    IPair<T1, T3> ignoreSecond();

    IPair<T1, T2> ignoreThird();*/


}
