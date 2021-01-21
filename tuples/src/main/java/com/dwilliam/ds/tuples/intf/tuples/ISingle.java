package com.dwilliam.ds.tuples.intf.tuples;

import com.dwilliam.ds.tuples.intf.ITuple;
import com.dwilliam.ds.tuples.intf.value.getter.IGetValue1;

/**
 * Marker interface serializable singles.
 *
 * @param <T1> the type of the element of the single
 */
public interface ISingle<T1> extends ITuple, IGetValue1<T1> {

    @Override
    ISingle<T1> clone();

    @Override
    default Object[] toArray() {
        return new Object[]{_1()};
    }

    /**
     * Creates a pair from the element of this single and the specified single.
     *
     * @param single the single to append to this single
     * @param <T2> the type of the second element of the pair
     * @return a {@code IPair}
     */
    default <T2> IPair<T1, T2> append(ISingle<T2> single) {
        return append(single._1());
    }

    /**
     * Creates a triple from the element of this single and the specified pair.
     *
     * @param pair the pair to append to this single
     * @param <T2> the type of the second element of the triple
     * @param <T3> the type of the third element of the triple
     * @return a {@code ITriple}
     */
    default <T2, T3> ITriple<T1, T2, T3> append(IPair<T2, T3> pair) {
        return append(pair._1(), pair._2());
    }

    /**
     * Creates a quad from the element of this single and the specified triple.
     *
     * @param triple the triple to append to this single
     * @param <T2> the type of the second element of the quad
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    default <T2, T3, T4> IQuad<T1, T2, T3, T4> append(ITriple<T2, T3, T4> triple) {
        return append(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a quint from the element of this single and the specified quad.
     *
     * @param quad the quad to append to this single
     * @param <T2> the type of the second element of the quint
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    default <T2, T3, T4, T5> IQuint<T1, T2, T3, T4, T5> append(IQuad<T2, T3, T4, T5> quad) {
        return append(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a sextuple from the element of this single and the specified quint.
     *
     * @param quint the quint to append to this single
     * @param <T2> the type of the second element of the sextuple
     * @param <T3> the type of the third element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    default <T2, T3, T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(IQuint<T2, T3, T4, T5, T6> quint) {
        return append(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a septuple from the element of this single and the specified sextuple.
     *
     * @param sextuple the sextuple to append to this single
     * @param <T2> the type of the second element of the septuple
     * @param <T3> the type of the third element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    default <T2, T3, T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(ISextuple<T2, T3, T4, T5, T6, T7> sextuple) {
        return append(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    /**
     * Creates a octa from the element of this single and the specified septuple.
     *
     * @param septuple the septuple to append to this single
     * @param <T2> the type of the second element of the octa
     * @param <T3> the type of the third element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    default <T2, T3, T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(ISeptuple<T2, T3, T4, T5, T6, T7, T8> septuple) {
        return append(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    /**
     * Creates a nonuple from the element of this single and the specified octa.
     *
     * @param octa the octa to append to this single
     * @param <T2> the type of the second element of the nonuple
     * @param <T3> the type of the third element of the nonuple
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    default <T2, T3, T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(IOcta<T2, T3, T4, T5, T6, T7, T8, T9> octa) {
        return append(octa._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    /**
     * Creates a decuple from the element of this single and the specified nonuple.
     *
     * @param nonuple the nonuple to append to this single
     * @param <T2> the type of the second element of the decuple
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
    default <T2, T3, T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(INonuple<T2, T3, T4, T5, T6, T7, T8, T9, T10> nonuple) {
        return append(nonuple._1(), nonuple._2(), nonuple._3(), nonuple._4(), nonuple._5(), nonuple._6(), nonuple._7(), nonuple._8(), nonuple._9());
    }

    /**
     * Creates a pair from the element of this single and the parameters.
     *
     * @param _2 the second element of the pair
     * @param <T2> the type of the second element of the pair
     * @return a {@code IPair}
     */
    <T2> IPair<T1, T2> append(T2 _2);

    /**
     * Creates a triple from the element of this single and the parameters.
     *
     * @param _2 the second element of the triple
     * @param _3 the third element of the triple
     * @param <T2> the type of the second element of the triple
     * @param <T3> the type of the third element of the triple
     * @return a {@code ITriple}
     */
    <T2, T3> ITriple<T1, T2, T3> append(T2 _2, T3 _3);

    /**
     * Creates a quad from the element of this single and the parameters.
     *
     * @param _2 the second element of the quad
     * @param _3 the third element of the quad
     * @param _4 the fourth element of the quad
     * @param <T2> the type of the second element of the quad
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code IQuad}
     */
    <T2, T3, T4> IQuad<T1, T2, T3, T4> append(T2 _2, T3 _3, T4 _4);

    /**
     * Creates a quint from the element of this single and the parameters.
     *
     * @param _2 the second element of the quint
     * @param _3 the third element of the quint
     * @param _4 the fourth element of the quint
     * @param _5 the fifth element of the quint
     * @param <T2> the type of the second element of the quint
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code IQuint}
     */
    <T2, T3, T4, T5> IQuint<T1, T2, T3, T4, T5> append(T2 _2, T3 _3, T4 _4, T5 _5);

    /**
     * Creates a sextuple from the element of this single and the parameters.
     *
     * @param _2 the second element of the sextuple
     * @param _3 the third element of the sextuple
     * @param _4 the fourth element of the sextuple
     * @param _5 the fifth element of the sextuple
     * @param _6 the sixth element of the sextuple
     * @param <T2> the type of the second element of the sextuple
     * @param <T3> the type of the third element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISextuple}
     */
    <T2, T3, T4, T5, T6> ISextuple<T1, T2, T3, T4, T5, T6> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6);

    /**
     * Creates a septuple from the element of this single and the parameters.
     *
     * @param _2 the second element of the septuple
     * @param _3 the third element of the septuple
     * @param _4 the fourth element of the septuple
     * @param _5 the fifth element of the septuple
     * @param _6 the sixth element of the septuple
     * @param _7 the seventh element of the septuple
     * @param <T2> the type of the second element of the septuple
     * @param <T3> the type of the third element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISeptuple}
     */
    <T2, T3, T4, T5, T6, T7> ISeptuple<T1, T2, T3, T4, T5, T6, T7> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7);

    /**
     * Creates a octa from the element of this single and the parameters.
     *
     * @param _2 the second element of the octa
     * @param _3 the third element of the octa
     * @param _4 the fourth element of the octa
     * @param _5 the fifth element of the octa
     * @param _6 the sixth element of the octa
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T2> the type of the second element of the octa
     * @param <T3> the type of the third element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code IOcta}
     */
    <T2, T3, T4, T5, T6, T7, T8> IOcta<T1, T2, T3, T4, T5, T6, T7, T8> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    /**
     * Creates a nonuple from the element of this single and the parameters.
     *
     * @param _2 the second element of the nonuple
     * @param _3 the third element of the nonuple
     * @param _4 the fourth element of the nonuple
     * @param _5 the fifth element of the nonuple
     * @param _6 the sixth element of the nonuple
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T2> the type of the second element of the nonuple
     * @param <T3> the type of the third element of the nonuple
     * @param <T4> the type of the fourth element of the nonuple
     * @param <T5> the type of the fifth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code INonuple}
     */
    <T2, T3, T4, T5, T6, T7, T8, T9> INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a decuple from the element of this single and the parameters.
     *
     * @param _2 the second element of the decuple
     * @param _3 the third element of the decuple
     * @param _4 the fourth element of the decuple
     * @param _5 the fifth element of the decuple
     * @param _6 the sixth element of the decuple
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T2> the type of the second element of the decuple
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
    <T2, T3, T4, T5, T6, T7, T8, T9, T10> IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> append(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

    // TODO default void consume(...Consumer<T1, ...> action) { Objects.requireNonNull(action).accept(_1(), ...); } + others (IPair, ...) + javadoc + consume + peek + map

}
