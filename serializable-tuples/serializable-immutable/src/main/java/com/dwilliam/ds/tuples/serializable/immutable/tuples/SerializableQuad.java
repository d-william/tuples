package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IQuad;
import com.dwilliam.ds.tuples.immutable.tuples.Quad;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableQuad;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableQuad<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable> extends Quad<T1, T2, T3, T4> implements ISerializableImmutableQuad<T1, T2, T3, T4> {

    public SerializableQuad(T1 _1, T2 _2, T3 _3, T4 _4) {
        super(_1, _2, _3, _4);
    }

    public SerializableQuad(IQuad<T1, T2, T3, T4> quad) {
        super(quad);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> clone() {
        return new SerializableQuad<>(this);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> _1(T1 _1) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> first(T1 _1) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> _2(T2 _2) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> second(T2 _2) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> _3(T3 _3) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> third(T3 _3) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> _4(T4 _4) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public SerializableQuad<T1, T2, T3, T4> fourth(T4 _4) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public <T5 extends Serializable> SerializableQuint<T1, T2, T3, T4, T5> appendSerializable(T5 _5) {
        return new SerializableQuint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public <T5 extends Serializable, T6 extends Serializable> SerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T5 _5, T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T5 _5, T6 _6, T7 _7) {
        return new SerializableSeptuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
