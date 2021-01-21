package com.dwilliam.ds.tuples.serializable.mutable.intf;

import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.mutable.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.Serializable;

/**
 * Marker interface for serializable mutable triples.
 *
 * @param <T1> the type of the first element of the triple
 * @param <T2> the type of the second element of the triple
 * @param <T3> the type of the third element of the triple
 */
public interface ISerializableMutableTriple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable> extends ISerializableTriple<T1, T2, T3>, IMutableTriple<T1, T2, T3> {

    @Override
    ISerializableMutableTriple<T1, T2, T3> clone();

    @Override
    default <T4 extends Serializable> ISerializableMutableQuad<T1, T2, T3, T4> appendSerializable(ISingle<T4> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable> ISerializableMutableQuint<T1, T2, T3, T4, T5> appendSerializable(IPair<T4, T5> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(ITriple<T4, T5, T6> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(IQuad<T4, T5, T6, T7> quad) {
        return appendSerializable(quad._1(),  quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(IQuint<T4, T5, T6, T7, T8> quint) {
        return appendSerializable(quint._1(),  quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ISextuple<T4, T5, T6, T7, T8, T9> sextuple) {
        return appendSerializable(sextuple._1(),  sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    default <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ISeptuple<T4, T5, T6, T7, T8, T9, T10> septuple) {
        return appendSerializable(septuple._1(),  septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    <T4 extends Serializable> ISerializableMutableQuad<T1, T2, T3, T4> appendSerializable(T4 _4);

    @Override
    <T4 extends Serializable, T5 extends Serializable> ISerializableMutableQuint<T1, T2, T3, T4, T5> appendSerializable(T4 _4, T5 _5);

    @Override
    <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T4 _4, T5 _5, T6 _6);

    @Override
    <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7);

    @Override
    <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
