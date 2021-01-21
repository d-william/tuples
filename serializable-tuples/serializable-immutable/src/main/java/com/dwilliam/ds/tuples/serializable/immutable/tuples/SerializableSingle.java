package com.dwilliam.ds.tuples.serializable.immutable.tuples;

import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.immutable.tuples.Single;
import com.dwilliam.ds.tuples.serializable.immutable.intf.ISerializableImmutableSingle;
import com.dwilliam.ds.tuples.serializable.intf.tuples.*;

import java.io.*;


//TODO javadoc + others
public class SerializableSingle<T1 extends Serializable> extends Single<T1> implements ISerializableImmutableSingle<T1> {

    public SerializableSingle(T1 _1) {
        super(_1);
    }

    public SerializableSingle(ISingle<T1> single) {
        super(single);
    }

    @Override
    public SerializableSingle<T1> clone() {
        return new SerializableSingle<T1>(this);
    }

    @Override
    public SerializableSingle<T1> _1(T1 _1) {
        return new SerializableSingle<>(_1);
    }

    @Override
    public SerializableSingle<T1> first(T1 _1) {
        return new SerializableSingle<>(_1);
    }

    @Override
    public <T2 extends Serializable> SerializablePair<T1, T2> appendSerializable(T2 _2) {
        return new SerializablePair<>(_1, _2);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable> SerializableTriple<T1, T2, T3> appendSerializable(T2 _2, T3 _3) {
        return new SerializableTriple<>(_1, _2, _3);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable> SerializableQuad<T1, T2, T3, T4> appendSerializable(T2 _2, T3 _3, T4 _4) {
        return new SerializableQuad<>(_1, _2, _3, _4);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable> SerializableQuint<T1, T2, T3, T4, T5> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5) {
        return new SerializableQuint<>(_1, _2, _3, _4, _5);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable> SerializableSextuple<T1, T2, T3, T4, T5, T6> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6) {
        return new SerializableSextuple<>(_1, _2, _3, _4, _5, _6);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable> SerializableSeptuple<T1, T2, T3, T4, T5, T6, T7> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7) {
        return new SerializableSeptuple<>(_1, _2, _3, _4, _5, _6, _7);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable> SerializableOcta<T1, T2, T3, T4, T5, T6, T7, T8> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8) {
        return new SerializableOcta<>(_1, _2, _3, _4, _5, _6, _7, _8);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> SerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9) {
        return new SerializableNonuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9);
    }

    @Override
    public <T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> SerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T2 _2, T3 _3, T4 _4, T5 _5, T6 _6, T7 _7, T8 _8, T9 _9, T10 _10) {
        return new SerializableDecuple<>(_1, _2, _3, _4, _5, _6, _7, _8, _9, _10);
    }

    @Override
    public Object writeReplace() throws ObjectStreamException {
        return createProxy();
    }

    /*public static void main(String[] args) throws IOException, ClassNotFoundException {
        File fichier =  new File("/tmp/test.ser");

        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fichier)) ;
        SerializablePair<String, Integer> pair = new SerializablePair<>("abcdef", 42);
        oos.writeObject(pair) ;

        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier)) ;
        SerializablePair<String, Integer> obj = (SerializablePair<String, Integer>) ois.readObject() ;
        System.out.println(obj) ;

        SerializableSingle<Integer> s = new SerializableSingle<>(1);
    }*/

}
