package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable singles.
 *
 * @param <T1> the type of the element of the single
 */
public interface ISerializableSingle<T1 extends Serializable> extends ISerializableTuple, ISingle<T1>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1()};
    }

    @Override
    ISerializableSingle<T1> clone();

    /**
     * Creates a serializable pair from the element of this single and the specified single.
     *
     * @param single the single to append to this single
     * @param <T2> the type of the second element of the pair
     * @return a {@code ISerializablePair}
     */
    default <T2 extends Serializable> ISerializablePair<T1, T2> appendSerializable(ISingle<T2> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable triple from the element of this single and the specified pair.
     *
     * @param pair the pair to append to this single
     * @param <T2> the type of the second element of the triple
     * @param <T3> the type of the third element of the triple
     * @return a {@code ISerializableTriple}
     */
    default <T2 extends Serializable, T3 extends Serializable> ISerializableTriple<T1, T2, T3> appendSerializable(IPair<T2, T3> pair) {
        return appendSerializable(pair._1(), pair._2());
    }

    /**
     * Creates a serializable quad from the element of this single and the specified triple.
     *
     * @param triple the triple to append to this single
     * @param <T2> the type of the second element of the quad
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code ISerializableQuad}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable> ISerializableQuad<T1, T2, T3, T4> appendSerializable(ITriple<T2, T3, T4> triple) {
        return appendSerializable(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a serializable quint from the element of this single and the specified quad.
     *
     * @param quad the quad to append to this single
     * @param <T2> the type of the second element of the quint
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code ISerializableQuint}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> ISerializableQuint<T1, T2, T3, T4, T5> appendSerializable(IQuad<T2, T3, T4, T5> quad) {
        return appendSerializable(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a serializable sextuple from the element of this single and the specified quint.
     *
     * @param quint the quint to append to this single
     * @param <T2> the type of the second element of the sextuple
     * @param <T3> the type of the third element of the sextuple
     * @param <T4> the type of the fourth element of the sextuple
     * @param <T5> the type of the fifth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISerializableSextuple}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(IQuint<T2, T3, T4, T5, T6> quint) {
        return appendSerializable(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a serializable septuple from the element of this single and the specified sextuple.
     *
     * @param sextuple the sextuple to append to this single
     * @param <T2> the type of the second element of the septuple
     * @param <T3> the type of the third element of the septuple
     * @param <T4> the type of the fourth element of the septuple
     * @param <T5> the type of the fifth element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISerializableSeptuple}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(ISextuple<T2, T3, T4, T5, T6, T7> sextuple) {
        return appendSerializable(sextuple._1(), sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    /**
     * Creates a serializable octa from the element of this single and the specified septuple.
     *
     * @param septuple the septuple to append to this single
     * @param <T2> the type of the second element of the octa
     * @param <T3> the type of the third element of the octa
     * @param <T4> the type of the fourth element of the octa
     * @param <T5> the type of the fifth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ISeptuple<T2, T3, T4, T5, T6, T7, T8> septuple) {
        return appendSerializable(septuple._1(), septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    /**
     * Creates a serializable nonuple from the element of this single and the specified octa.
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
     * @return a {@code ISerializableNonuple}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IOcta<T2, T3, T4, T5, T6, T7, T8, T9> octa) {
        return appendSerializable(octa._1(), octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    /**
     * Creates a serializable decuple from the element of this single and the specified nonuple.
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
     * @return a {@code ISerializableDecuple}
     */
    default <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(INonuple<T2, T3, T4, T5, T6, T7, T8, T9, T10> nonuple) {
        return appendSerializable(nonuple._1(), nonuple._2(), nonuple._3(), nonuple._4(), nonuple._5(), nonuple._6(), nonuple._7(), nonuple._8(), nonuple._9());
    }

    /**
     * Creates a serializable pair from the element of this single and the parameters.
     *
     * @param _2 the second element of the pair
     * @param <T2> the type of the second element of the pair
     * @return a {@code ISerializablePair}
     */
    <T2 extends Serializable> ISerializablePair<T1, T2> appendSerializable(T2 _2);

    /**
     * Creates a serializable triple from the element of this single and the parameters.
     *
     * @param _2 the second element of the triple
     * @param _3 the third element of the triple
     * @param <T2> the type of the second element of the triple
     * @param <T3> the type of the third element of the triple
     * @return a {@code ISerializableTriple}
     */
    <T2 extends Serializable, T3 extends Serializable> ISerializableTriple<T1, T2, T3> appendSerializable(T2 _2, T3 _3);

    /**
     * Creates a serializable quad from the element of this single and the parameters.
     *
     * @param _2 the second element of the quad
     * @param _3 the third element of the quad
     * @param _4 the fourth element of the quad
     * @param <T2> the type of the second element of the quad
     * @param <T3> the type of the third element of the quad
     * @param <T4> the type of the fourth element of the quad
     * @return a {@code ISerializableQuad}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable> ISerializableQuad<T1, T2, T3, T4> appendSerializable(T2 _2, T3 _3, T4 _4);

    /**
     * Creates a serializable quint from the element of this single and the parameters.
     *
     * @param _2 the second element of the quint
     * @param _3 the third element of the quint
     * @param _4 the fourth element of the quint
     * @param _5 the fifth element of the quint
     * @param <T2> the type of the second element of the quint
     * @param <T3> the type of the third element of the quint
     * @param <T4> the type of the fourth element of the quint
     * @param <T5> the type of the fifth element of the quint
     * @return a {@code ISerializableQuint}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> ISerializableQuint<T1, T2, T3, T4, T5> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5);

    /**
     * Creates a serializable sextuple from the element of this single and the parameters.
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
     * @return a {@code ISerializableSextuple}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6);

    /**
     * Creates a serializable septuple from the element of this single and the parameters.
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
     * @return a {@code ISerializableSeptuple}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7);

    /**
     * Creates a serializable octa from the element of this single and the parameters.
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
     * @return a {@code ISerializableOcta}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    /**
     * Creates a serializable nonuple from the element of this single and the parameters.
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
     * @return a {@code ISerializableNonuple}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a serializable decuple from the element of this single and the parameters.
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
     * @return a {@code ISerializableDecuple}
     */
    <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
