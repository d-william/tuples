package com.dwilliam.ds.tuples.serializable.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IQuint;
import com.dwilliam.ds.tuples.mutable.tuples.Quint;
import com.dwilliam.ds.tuples.serializable.mutable.intf.*;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableQuint<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> extends Quint<T1, T2, T3, T4, T5> implements ISerializableMutableQuint<T1, T2, T3, T4, T5> {

    public SerializableQuint(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5) {
        super(_1, _2, _3, _4, _5);
    }

    public SerializableQuint(IQuint<T1, T2, T3, T4, T5> quint) {
        super(quint);
    }

    @Override
    public SerializableQuint<T1, T2, T3, T4, T5> clone() {
        return new SerializableQuint<>(this);
    }

    @Override
    public <T6 extends Serializable> SerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T6 extends Serializable, T7 extends Serializable> SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T6 _6, T7 _7) {
        return new SerializableSeptuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T6 _6, T7 _7, T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
