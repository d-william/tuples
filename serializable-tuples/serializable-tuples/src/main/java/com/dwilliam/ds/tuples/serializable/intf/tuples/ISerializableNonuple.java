package com.dwilliam.ds.tuples.serializable.intf.tuples;

import com.dwilliam.ds.tuples.intf.tuples.INonuple;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.serializable.intf.ISerializableTuple;

import java.io.Serializable;

/**
 * Marker interface for serializable nonuples.
 *
 * @param <T1> the type of the first element of the decuple
 * @param <T2> the type of the second element of the decuple
 * @param <T3> the type of the third element of the decuple
 * @param <T4> the type of the fourth element of the decuple
 * @param <T5> the type of the fifth element of the decuple
 * @param <T6> the type of the sixth element of the decuple
 * @param <T7> the type of the seventh element of the decuple
 * @param <T8> the type of the eighth element of the decuple
 * @param <T9> the type of the ninth element of the decuple
 */
public interface ISerializableNonuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> extends ISerializableTuple, INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, Serializable {

    @Override
    default Serializable[] toArray() {
        return new Serializable[]{_1(), _2(), _3(), _4(), _5(), _6(), _7(), _8(), _9()};
    }

    @Override
    ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone();

    /**
     * Creates a serializable decuple from the element of this nonuple and the single in parameters.
     *
     * @param single the single that contains the elements with which the decuple will be constructed
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    default <T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ISingle<T10> single) {
        return appendSerializable(single._1());
    }

    /**
     * Creates a serializable decuple from the element of this nonuple and the parameters.
     *
     * @param _10 the tenth element of the decuple
     * @param <T10> the type of the tenth element of the decuple
     * @return a {@code ISerializableDecuple}
     */
    <T10 extends Serializable> ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T10 _10);

}
