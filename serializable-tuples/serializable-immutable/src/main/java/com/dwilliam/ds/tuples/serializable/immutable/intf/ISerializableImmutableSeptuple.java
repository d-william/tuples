package com.dwilliam.ds.tuples.serializable.immutable.intf;

import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutableSeptuple;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.intf.tuples.ITriple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableNonuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableOcta;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableSeptuple;

import java.io.Serializable;

/**
 * Marker interface for serializable immutable septuples.
 *
 * @param <T1> the type of the first element of the septuple
 * @param <T2> the type of the second element of the septuple
 * @param <T3> the type of the third element of the septuple
 * @param <T4> the type of the fourth element of the septuple
 * @param <T5> the type of the fifth element of the septuple
 * @param <T6> the type of the sixth element of the septuple
 * @param <T7> the type of the seventh element of the septuple
 */
public interface ISerializableImmutableSeptuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> extends ISerializableSeptuple<T1, T2, T3, T4, T5, T6, T7>, IImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> {

    @Override
    ISerializableImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> clone();

    @Override
    default <T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ISingle<T8> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IPair<T8, T9> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ITriple<T8, T9, T10> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    <T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T8 _8);

    @Override
    <T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T8 _8, T9 _9);

    @Override
    <T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T8 _8, T9 _9, T10 _10);

}
