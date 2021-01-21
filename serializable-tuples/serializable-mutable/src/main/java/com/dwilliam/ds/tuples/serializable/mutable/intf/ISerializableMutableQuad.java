package com.dwilliam.ds.tuples.serializable.mutable.intf;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.Serializable;

/**
 * Marker interface for serializable mutable quads.
 *
 * @param <T1> the type of the first element of the quad
 * @param <T2> the type of the second element of the quad
 * @param <T3> the type of the third element of the quad
 * @param <T4> the type of the fourth element of the quad
 */
public interface ISerializableMutableQuad<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable> extends ISerializableQuad<T1, T2, T3, T4>, IMutableQuad<T1, T2, T3, T4> {

    @Override
    ISerializableMutableQuad<T1, T2, T3, T4> clone();

    @Override
    default <T5 extends Serializable> ISerializableMutableQuint<T1, T2, T3, T4, T5> appendSerializable(ISingle<T5> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T5 extends Serializable, T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(IPair<T5, T6> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(ITriple<T5, T6, T7> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    default <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(IQuad<T5, T6, T7, T8> quad) {
        return appendSerializable(quad._1(),  quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(IQuint<T5, T6, T7, T8, T9> quint) {
        return appendSerializable(quint._1(),  quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ISextuple<T5, T6, T7, T8, T9, T10> sextuple) {
        return appendSerializable(sextuple._1(),  sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    <T5 extends Serializable> ISerializableMutableQuint<T1, T2, T3, T4, T5> appendSerializable(T5 _5);

    @Override
    <T5 extends Serializable, T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T5 _5, T6 _6);

    @Override
    <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T5 _5, T6 _6, T7 _7);

    @Override
    <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
