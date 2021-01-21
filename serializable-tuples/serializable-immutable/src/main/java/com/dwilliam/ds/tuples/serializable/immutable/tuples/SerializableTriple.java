package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.immutable.tuples.Triple;
import com.dwilliam.ds.tuples.intf.tuples.ITriple;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableTriple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableTriple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable> extends Triple<T1, T2, T3> implements ISerializableImmutableTriple<T1, T2, T3> {

    public SerializableTriple(T1 _1, T2 _2, T3 _3) {
        super(_1, _2, _3);
    }

    public SerializableTriple(ITriple<T1, T2, T3> triple) {
        super(triple);
    }

    @Override
    public SerializableTriple<T1, T2, T3> clone() {
        return new SerializableTriple<>(this); // SerializableTriple<T1, T2, T3>
    }

    @Override
    public SerializableTriple<T1, T2, T3> _1(T1 _1) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public SerializableTriple<T1, T2, T3> first(T1 _1) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public SerializableTriple<T1, T2, T3> _2(T2 _2) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public SerializableTriple<T1, T2, T3> second(T2 _2) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public SerializableTriple<T1, T2, T3> _3(T3 _3) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public SerializableTriple<T1, T2, T3> third(T3 _3) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public <T4 extends Serializable> SerializableQuad<T1, T2, T3, T4> appendSerializable(T4 _4) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable> SerializableQuint<T1, T2, T3, T4, T5> appendSerializable(T4 _4, T5 _5) {
        return new SerializableQuint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> SerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T4 _4, T5 _5, T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7) {
        return new SerializableSeptuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
