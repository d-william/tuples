package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.ISextuple;
import com.dwilliam.ds.tuples.immutable.tuples.Sextuple;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableSextuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableNonuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableOcta;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableSeptuple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableSextuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> extends Sextuple<T1, T2, T3, T4, T5, T6> implements ISerializableImmutableSextuple<T1, T2, T3, T4, T5, T6> {

    public SerializableSextuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        super(_1, _2, _3, _4, _5, _6);
    }

    public SerializableSextuple(ISextuple<T1, T2, T3, T4, T5, T6> sextuple) {
        super(sextuple);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> clone() {
        return new SerializableSextuple<>(this); // SerializableSextuple<T1, T2, T3, T4, T5, T6>
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _1(T1 _1) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> first(T1 _1) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _2(T2 _2) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> second(T2 _2) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _3(T3 _3) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> third(T3 _3) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _4(T4 _4) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> fourth(T4 _4) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _5(T5 _5) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> fifth(T5 _5) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> _6(T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public SerializableSextuple<T1, T2, T3, T4, T5, T6> sixth(T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
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
