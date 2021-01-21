package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IOcta;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable octas.
 *
 * @param <T1> the type of the first element of the octa
 * @param <T2> the type of the second element of the octa
 * @param <T3> the type of the third element of the octa
 * @param <T4> the type of the fourth element of the octa
 * @param <T5> the type of the fifth element of the octa
 * @param <T6> the type of the sixth element of the octa
 * @param <T7> the type of the seventh element of the octa
 * @param <T8> the type of the eighth element of the octa
 */
public interface ISerializableOcta<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> extends ISerializableTuple, IOcta<T1, T2, T3, T4, T5, T6, T7, T8>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1(), _2(), _3(), _4(), _5(), _6(), _7(), _8()};
    }

    @Override
    ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone();

    /**
     * Creates a serializable nonuple from the element of this octa and the specified single.
     *
     * @param single the single to append to this octa
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    default <T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ISingle<T9> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable decuple from the element of this octa and the specified pair.
     *
     * @param pair the pair to append to this octa
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    default <T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IPair<T9, T10> pair) {
        return appendSerializable(pair._1(), pair._2());
    }

    /**
     * Creates a serializable nonuple from the element of this octa and the parameters.
     *
     * @param _9 the ninth element of the nonuple
     * @param <T9> the type of the ninth element of the nonuple
     * @return a {@code ISerializableNonuple}
     */
    <T9 extends Serializable> ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T9 _9);

    /**
     * Creates a serializable decuple from the element of this octa and the parameters.
     *
     * @param _9 the ninth element of the decuple
     * @param _10 the tenth element of the decuple
     * @param <T9> the type of the ninth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    <T9 extends Serializable, T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T9 _9, T10 _10);

}
