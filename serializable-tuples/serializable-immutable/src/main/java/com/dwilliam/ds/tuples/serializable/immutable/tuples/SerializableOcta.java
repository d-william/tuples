package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IOcta;
import com.dwilliam.ds.tuples.immutable.tuples.Octa;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableOcta;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableNonuple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableOcta<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> extends Octa<T1, T2, T3, T4, T5, T6, T7, T8> implements ISerializableImmutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> {

    public SerializableOcta(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        super(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    public SerializableOcta(IOcta<T1, T2, T3, T4, T5, T6, T7, T8> octa) {
        super(octa);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone() {
        return new SerializableOcta<>(this); // SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8>
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _1(T1 _1) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> first(T1 _1) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _2(T2 _2) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> second(T2 _2) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _3(T3 _3) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> third(T3 _3) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _4(T4 _4) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> fourth(T4 _4) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _5(T5 _5) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> fifth(T5 _5) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _6(T6 _6) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> sixth(T6 _6) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _7(T7 _7) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> seventh(T7 _7) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> _8(T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> eighth(T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
