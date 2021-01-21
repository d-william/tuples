package com.dwilliam.ds.tuples.serializable.immutable.intf;

import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutableSextuple;
import com.dwilliam.ds.tuples.intf.tuples.IPair;
import com.dwilliam.ds.tuples.intf.tuples.IQuad;
import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.intf.tuples.ITriple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.Serializable;

/**
 * Marker interface for serializable immutable sextuples.
 *
 * @param <T1> the type of the first element of the sextuple
 * @param <T2> the type of the second element of the sextuple
 * @param <T3> the type of the third element of the sextuple
 * @param <T4> the type of the fourth element of the sextuple
 * @param <T5> the type of the fifth element of the sextuple
 * @param <T6> the type of the sixth element of the sextuple
 */
public interface ISerializableImmutableSextuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> extends ISerializableSextuple<T1, T2, T3, T4, T5, T6>, IImmutableSextuple<T1, T2, T3, T4, T5, T6> {

    @Override
    ISerializableImmutableSextuple<T1, T2, T3, T4, T5, T6> clone();

    @Override
    default <T7 extends Serializable> ISerializableImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(ISingle<T7> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T7 extends Serializable, T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(IPair<T7, T8> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ITriple<T7, T8, T9> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    default <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IQuad<T7, T8, T9, T10> quad) {
        return appendSerializable(quad._1(),  quad._2(), quad._3(), quad._4());
    }

    @Override
    <T7 extends Serializable> ISerializableImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T7 _7);

    @Override
    <T7 extends Serializable, T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T7 _7, T8 _8);

    @Override
    <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T7 _7, T8 _8, T9 _9);

    @Override
    <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T7 _7, T8 _8, T9 _9, T10 _10);

}
