package com.dwilliam.ds.tuples.serializable.immutable.intf;

import com.dwilliam.ds.tuples.immutable.intf.tuples.IImmutableDecuple;
import com.dwilliam.ds.tuples.serializable.intf.tuples.ISerializableDecuple;

import java.io.Serializable;

/**
 * Marker interface for serializable immutable decuples.
 *
 * @param <T1> the type of the first element of the decuple
 * @param <T2> the type of the second element of the decuple
 * @param <T3> the type of the third element of the decuple
 * @param <T4> the type of the fourth element of the decuple
 * @param <T5> the type of the fifth element of the decuple
 * @param <T6> the type of the sixth element of the decuple
 * @param <T7> the type of the seventh element of the decuple
 * @param <T8> the type of the eighth element of the decuple
 * @param <T9> the type of the ninth element of the decuple
 * @param <T10> the type of the ninth element of the decuple
 */
public interface ISerializableImmutableDecuple<T1 extends Serializable, T2 extends Serializable, T3 extends Serializable, T4 extends Serializable, T5 extends Serializable, T6 extends Serializable, T7 extends Serializable, T8 extends Serializable, T9 extends Serializable, T10 extends Serializable> extends ISerializableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>, IImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> {

    @Override
    ISerializableImmutableDecuple<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone();

}
