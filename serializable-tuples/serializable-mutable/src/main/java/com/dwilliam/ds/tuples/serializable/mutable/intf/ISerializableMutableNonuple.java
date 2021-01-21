package com.dwilliam.ds.tuples.serializable.mutable.intf;

import com.dwilliam.ds.tuples.intf.tuples.ISingle;
import com.dwilliam.ds.tuples.mutable.intf.tuples.IMutableDecuple;
import com.dwilliam.ds.tuples.mutable.intf.tuples.IMutableNonuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableNonuple;

import java.io.Serializable;

/**
 * Marker interface for serializable mutable nonuples.
 *
 * @param <T1> the type of the first element of the nonuple
 * @param <T2> the type of the second element of the nonuple
 * @param <T3> the type of the third element of the nonuple
 * @param <T4> the type of the fourth element of the nonuple
 * @param <T5> the type of the fifth element of the nonuple
 * @param <T6> the type of the sixth element of the nonuple
 * @param <T7> the type of the seventh element of the nonuple
 * @param <T8> the type of the eighth element of the nonuple
 * @param <T9> the type of the ninth element of the nonuple
 */
public interface ISerializableMutableNonuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable> extends ISerializableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9>, IMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> {

    @Override
    ISerializableMutableNonuple<T1, T2, T3, T4, T5, T6, T7, T8, T9> clone();

    @Override
    default <T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(ISingle<T10> single) {
        return appendSerializable(single._1());
    }

    @Override
    <T10 extends Serializable> ISerializableMutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> appendSerializable(T10 _10);

}
