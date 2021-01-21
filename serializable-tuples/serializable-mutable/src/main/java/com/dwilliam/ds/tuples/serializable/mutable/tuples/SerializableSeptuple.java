package com.dwilliam.ds.tuples.serializable.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.ISeptuple;
import com.dwilliam.ds.tuples.mutable.tuples.Septuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableDecuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableNonuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableOcta;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableSeptuple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSeptuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> extends Septuple<T1, T2, T3, T4, T5, T6, T7> implements ISerializableMutableSeptuple<T1, T2, T3, T4, T5, T6, T7> {

    public SerializableSeptuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        super(_1, _2, _3, _4, _5, _6, _7);
    }

    public SerializableSeptuple(ISeptuple<T1, T2, T3, T4, T5, T6, T7> septuple) {
        super(septuple);
    }

    @Override
    public SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> clone() {
        return new SerializableSeptuple<>(this);
    }

    @Override
    public <T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
