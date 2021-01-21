package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable quintuples.
 *
 * @param <T1> the type of the first element of the quintuple
 * @param <T2> the type of the second element of the quintuple
 * @param <T3> the type of the third element of the quintuple
 * @param <T4> the type of the fourth element of the quintuple
 * @param <T5> the type of the fifth element of the quintuple
 */
public interface ISerializableQuint<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> extends ISerializableTuple, IQuint<T1, T2, T3, T4, T5>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1(), _2(), _3(), _4(), _5()};
    }

    @Override
    ISerializableQuint<T1, T2, T3, T4, T5> clone();

    /**
     * Creates a serializable sextuple from the element of this quintuple and the specified single.
     *
     * @param single the single to append to this quintuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISerializableSextuple}
     */
    default <T6 extends Serializable> ISerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(ISingle<T6> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable septuple from the element of this quintuple and the specified pair.
     *
     * @param pair the pair to append to this quintuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISerializableSeptuple}
     */
    default <T6 extends Serializable, T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(IPair<T6, T7> pair) {
        return appendSerializable(pair._1(), pair._2());
    }

    /**
     * Creates a serializable octa from the element of this quintuple and the specified triple.
     *
     * @param triple the triple to append to this quintuple
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ITriple<T6, T7, T8> triple) {
        return appendSerializable(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a serializable nonuple from the element of this quintuple and the specified quad.
     *
     * @param quad the quad to append to this quintuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IQuad<T6, T7, T8, T9> quad) {
        return appendSerializable(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a serializable decuple from the element of this quintuple and the specified quint.
     *
     * @param quint the quint to append to this quintuple
     * @param <T6> the type of the sixth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IQuint<T6, T7, T8, T9, T10> quint) {
        return appendSerializable(quint._1(), quint._2(), quint._3(), quint._4(), quint._5());
    }

    /**
     * Creates a serializable sextuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the sextuple
     * @param <T6> the type of the sixth element of the sextuple
     * @return a {@code ISerializableSextuple}
     */
    <T6 extends Serializable> ISerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T6 _6);

    /**
     * Creates a serializable septuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the septuple
     * @param _7 the seventh element of the septuple
     * @param <T6> the type of the sixth element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISerializableSeptuple}
     */
    <T6 extends Serializable, T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T6 _6, T7 _7);

    /**
     * Creates a serializable octa from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the octa
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T6> the type of the sixth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T6 _6, T7 _7, T8 _8);

    /**
     * Creates a serializable nonuple from the element of this quintuple and the parameters.
     *
     * @param _6 the sixth element of the nonuple
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T6> the type of the sixth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9);

    /**
     * Creates a serializable decuple from the element of this quintuple and the parameters.
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
     * @return a {@code ISerializableDecuple}
     */
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
