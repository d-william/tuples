package com.dwilliam.ds.tuples.serializable.immutable.intf;

import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutableOcta;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableNonuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableOcta;

import java.io.Serializable;

/**
 * Marker interface for serializable immutable octas.
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
public interface ISerializableImmutableOcta<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> extends ISerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8>, IImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> {

    @Override
    ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone();

    @Override
    default <T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ISingle<T9> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IPair<T9, T10> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    <T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T9 _9);

    @Override
    <T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T9 _9, T10 _10);

}
