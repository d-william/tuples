package com.dwilliam.ds.tuples.serializable.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.ISextuple;
import com.dwilliam.ds.tuples.mutable.tuples.Sextuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.*;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSextuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> extends Sextuple<T1, T2, T3, T4, T5, T6> implements ISerializableMutableSextuple<T1, T2, T3, T4, T5, T6> {

    public SerializableSextuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        super(_1, _2, _3, _4, _5, _6);
    }

    public SerializableSextuple(ISextuple<T1, T2, T3, T4, T5, T6> sextuple) {
        super(sextuple);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> clone() {
        return new SerializableSextuple<>(this);
    }

    @Override
    public <T7 extends Serializable> SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T7 _7) {
        return new SerializableSeptuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T7 extends Serializable, T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T7 _7, T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T7 _7, T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T7 _7, T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
