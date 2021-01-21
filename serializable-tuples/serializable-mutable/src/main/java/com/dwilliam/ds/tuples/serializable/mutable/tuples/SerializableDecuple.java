package com.dwilliam.ds.tuples.serializable.mutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.IDecuple;
import com.dwilliam.ds.tuples.mutable.tuples.Decuple;
import com.dwilliam.ds.tuples.serializable.mutable.intf.ISerializableMutableDecuple;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableDecuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> extends Decuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> implements ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

    public SerializableDecuple(T1 _1, T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        super(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    public SerializableDecuple(IDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> decuple) {
        super(decuple);
    }

    @Override
    public SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone() {
        return new SerializableDecuple<>(this);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

}
