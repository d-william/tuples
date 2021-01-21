package com.dwilliam.ds.tuples.serializable.immutable.intf;

import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutablePair;
import com.dwilliam.ds.tuples.intf.tuples.*;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.Serializable;

/**
 * Marker interface for serializable immutable pairs.
 *
 * @param <T1> the type of the first element of the pair
 * @param <T2> the type of the second element of the pair
 */
public interface ISerializableImmutablePair<T1 extends Serializable, T2 extends Serializable> extends ISerializablePair<T1, T2>, IImmutablePair<T1, T2> {

    @Override
    ISerializableImmutablePair<T1, T2> clone();

    @Override
    default <T3 extends Serializable> ISerializableImmutableTriple<T1, T2, T3> appendSerializable(ISingle<T3> single) {
        return appendSerializable(single._1());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable> ISerializableImmutableQuad<T1, T2, T3, T4> appendSerializable(IPair<T3, T4> pair) {
        return appendSerializable(pair._1(),  pair._2());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> ISerializableImmutableQuint<T1, T2, T3, T4, T5> appendSerializable(ITriple<T3, T4, T5> triple) {
        return appendSerializable(triple._1(),  triple._2(), triple._3());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableImmutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(IQuad<T3, T4, T5, T6> quad) {
        return appendSerializable(quad._1(),  quad._2(), quad._3(), quad._4());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(IQuint<T3, T4, T5, T6, T7> quint) {
        return appendSerializable(quint._1(),  quint._2(), quint._3(), quint._4(), quint._5());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(ISextuple<T3, T4, T5, T6, T7, T8> sextuple) {
        return appendSerializable(sextuple._1(),  sextuple._2(), sextuple._3(), sextuple._4(), sextuple._5(), sextuple._6());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(ISeptuple<T3, T4, T5, T6, T7, T8, T9> septuple) {
        return appendSerializable(septuple._1(),  septuple._2(), septuple._3(), septuple._4(), septuple._5(), septuple._6(), septuple._7());
    }

    @Override
    default <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(IOcta<T3, T4, T5, T6, T7, T8, T9, T10> octa) {
        return appendSerializable(octa._1(),  octa._2(), octa._3(), octa._4(), octa._5(), octa._6(), octa._7(), octa._8());
    }

    @Override
    <T3 extends Serializable> ISerializableImmutableTriple<T1, T2, T3> appendSerializable(T3 _3);

    @Override
    <T3 extends Serializable, T4 extends Serializable> ISerializableImmutableQuad<T1, T2, T3, T4> appendSerializable(T3 _3, T4 _4);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> ISerializableImmutableQuint<T1, T2, T3, T4, T5> appendSerializable(T3 _3, T4 _4, T5 _5);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> ISerializableImmutableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T3 _3, T4 _4, T5 _5, T6 _6);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> ISerializableImmutableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9);

    @Override
    <T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10);

}
