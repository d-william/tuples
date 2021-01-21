package com.dwilliam.ds.tuples.serializable.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IOcta;
import com.dwilliam.ds.tuples.mutable.tuples.Octa;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableDecuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableNonuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableOcta;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableOcta<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> extends Octa<T1, T2, T3, T4, T5, T6, T7, T8> implements ISerializableMutableOcta<T1, T2, T3, T4, T5, T6, T7, T8> {

    public SerializableOcta(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        super(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    public SerializableOcta(IOcta<T1, T2, T3, T4, T5, T6, T7, T8> octa) {
        super(octa);
    }

    @Override
    public SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> clone() {
        return new SerializableOcta<>(this);
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
