package com.dwilliam.ds.tuples.serializable.mutable.intf;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.Serializable;

/**
 * Marker interface for serializable mutable quintuples.
 *
 * @param <T1> the type of the first element of the quintuple
 * @param <T2> the type of the second element of the quintuple
 * @param <T3> the type of the third element of the quintuple
 * @param <T4> the type of the fourth element of the quintuple
 * @param <T5> the type of the fifth element of the quintuple
 */
public interface ISerializableMutableQuint<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> extends ISerializableQuint<T1, T2, T3, T4, T5>, IMutableQuint<T1, T2, T3, T4, T5> {

    @Override
    ISerializableMutableQuint<T1, T2, T3, T4, T5> clone();

    @Override
    default <T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(ISingle<T6> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(IPair<T6, T7> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ITriple<T6, T7, T8> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IQuad<T6, T7, T8, T9> quad) {
        return appendSerializable(quad._1(),  quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IQuint<T6, T7, T8, T9, T10> quint) {
        return appendSerializable(quint._1(),  quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    <T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T6 _6);

    @Override
    <T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T6 _6, T7 _7);

    @Override
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T6 _6, T7 _7, T8 _8);

    @Override
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
