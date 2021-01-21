package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable septuples.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public interface ISerializableSeptuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> extends ISerializableTuple, ISeptuple<T1, T2, T3, T4, T5, T6, T7>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1(), _2(), _3(), _4(), _5(), _6(), _7()};
    }

    @Override
    ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> clone();

    /**
     * Creates a serializable octa from the element of this septuple and the specified single.
     *
     * @param single the single to append to this septuple
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    default <T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ISingle<T8> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable nonuple from the element of this septuple and the specified pair.
     *
     * @param pair the pair to append to this septuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    default <T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IPair<T8, T9> pair) {
        return appendSerializable(pair._1(), pair._2());
    }

    /**
     * Creates a serializable decuple from the element of this septuple and the specified triple.
     *
     * @param triple the triple to append to this septuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    default <T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ITriple<T8, T9, T10> triple) {
        return appendSerializable(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a serializable octa from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    <T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T8 _8);

    /**
     * Creates a serializable nonuple from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    <T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T8 _8, T9 _9);

    /**
     * Creates a serializable decuple from the element of this septuple and the parameters.
     *
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    <T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T8 _8, T9 _9, T10 _10);

}
