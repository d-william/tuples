package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.INonuple;
import com.dwilliam.ds.tuples.immutable.tuples.Nonuple;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableNonuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableNonuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> extends Nonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> implements ISerializableImmutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> {

    public SerializableNonuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        super(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    public SerializableNonuple(INonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> nonuple) {
        super(nonuple);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone() {
        return new SerializableNonuple<>(this); // SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _1(T1 _1) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> first(T1 _1) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _2(T2 _2) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> second(T2 _2) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _3(T3 _3) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> third(T3 _3) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _4(T4 _4) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> fourth(T4 _4) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _5(T5 _5) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> fifth(T5 _5) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _6(T6 _6) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> sixth(T6 _6) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _7(T7 _7) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> seventh(T7 _7) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _8(T8 _8) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> eighth(T8 _8) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> _9(T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> ninth(T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
