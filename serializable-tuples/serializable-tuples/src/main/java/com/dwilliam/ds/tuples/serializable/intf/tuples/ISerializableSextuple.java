package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable sextuples.
 *
 * @param <T1> the type of the first element of the decuple
 * @param <T2> the type of the second element of the decuple
 * @param <T3> the type of the third element of the decuple
 * @param <T4> the type of the fourth element of the decuple
 * @param <T5> the type of the fifth element of the decuple
 * @param <T6> the type of the sixth element of the decuple
 */
public interface ISerializableSextuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> extends ISerializableTuple, ISextuple<T1, T2, T3, T4, T5, T6>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1(), _2(), _3(), _4(), _5(), _6()};
    }

    @Override
    ISerializableSextuple<T1, T2, T3, T4, T5, T6> clone();

    /**
     * Creates a serializable septuple from the element of this sextuple and the single in parameters.
     *
     * @param single the single that contains the elements with which the septuple will be constructed
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISerializableSeptuple}
     */
    default <T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(ISingle<T7> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable octa from the element of this sextuple and the pair in parameters.
     *
     * @param pair the pair that contains the elements with which the octa will be constructed
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    default <T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(IPair<T7, T8> pair) {
        return appendSerializable(pair._1(), pair._2());
    }

    /**
     * Creates a serializable nonuple from the element of this sextuple and the triple in parameters.
     *
     * @param triple the triple that contains the elements with which the nonuple will be constructed
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    default <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ITriple<T7, T8, T9> triple) {
        return appendSerializable(triple._1(), triple._2(), triple._3());
    }

    /**
     * Creates a serializable decuple from the element of this sextuple and the quad in parameters.
     *
     * @param quad the quad that contains the elements with which the decuple will be constructed
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    default <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IQuad<T7, T8, T9, T10> quad) {
        return appendSerializable(quad._1(), quad._2(), quad._3(), quad._4());
    }

    /**
     * Creates a serializable septuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the septuple
     * @param <T7> the type of the seventh element of the septuple
     * @return a {@code ISerializableSeptuple}
     */
    <T7 extends Serializable> ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T7 _7);

    /**
     * Creates a serializable octa from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the octa
     * @param _8 the eighth element of the octa
     * @param <T7> the type of the seventh element of the octa
     * @param <T8> the type of the eighth element of the octa
     * @return a {@code ISerializableOcta}
     */
    <T7 extends Serializable, T8 extends Serializable> ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T7 _7, T8 _8);

    /**
     * Creates a serializable nonuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the nonuple
     * @param _8 the eighth element of the nonuple
     * @param _9 the ninth element of the nonuple
     * @param <T7> the type of the seventh element of the nonuple
     * @param <T8> the type of the eighth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T7 _7, T8 _8, T9 _9);

    /**
     * Creates a serializable decuple from the element of this sextuple and the parameters.
     *
     * @param _7 the seventh element of the decuple
     * @param _8 the eighth element of the decuple
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T7> the type of the seventh element of the decuple
     * @param <T8> the type of the eighth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T7 _7, T8 _8, T9 _9, T10 _10);

}
