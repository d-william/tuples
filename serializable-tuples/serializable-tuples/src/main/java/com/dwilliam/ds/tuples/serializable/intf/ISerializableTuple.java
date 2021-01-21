package com.dwilliam.ds.tuples.serializable.intf;

import com.dwilliam.ds.tuples.intf.ITuple;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

public interface ISerializableTuple extends ITuple {

    @Override
    Serializable[] toArray();

    @Override
    ISerializableTuple clone();

    Object writeReplace() throws ObjectStreamException;

    class SerializableProxy implements Serializable {

        private final Class<? extends ISerializableTuple> clazz;
        private final Serializable[] array;

        public SerializableProxy(Class<? extends ISerializableTuple> clazz, Serializable[] array) {
            this.clazz = clazz;
            this.array = array;
        }

        private Object readResolve() throws ObjectStreamException {
            Class<?>[] classes = Stream.of(array).map(e -> Serializable.class).toArray(Class<?>[]::new);
            try {
                return this.clazz.getConstructor(classes).newInstance(array);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

    }

    default Object createProxy() {
        return new SerializableProxy(this.getClass(), toArray());
    }

}
